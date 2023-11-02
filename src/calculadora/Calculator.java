package calculadora;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Calculator {
    private JPanel Calculator;
    private JTextField textDisplay;
    private JButton ACButton;
    private JButton xButton;
    private JButton a8Button;
    private JButton a4Button;
    private JButton button5;
    private JButton button6;
    private JButton a7Button;
    private JButton a4Button1;
    private JButton a1Button;
    private JButton a00Button;
    private JButton button11;
    private JButton a8Button1;
    private JButton a5Button;
    private JButton a2Button;
    private JButton a0Button;
    private JButton button16;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a3Button;
    private JButton button20;

    double a, b, result;
    String op;

    public Calculator() {



        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText("");
            }
        });

        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a0Button.getText());
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a1Button.getText());
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a2Button.getText());
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a3Button.getText());
            }
        });
        a4Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a4Button1.getText());
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a5Button.getText());
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a6Button.getText());
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a7Button.getText());
            }
        });
        a8Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a8Button1.getText());
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a9Button.getText());
            }
        });
        button16.addActionListener(new ActionListener() { // botao de + ou -
            @Override
            public void actionPerformed(ActionEvent e) {

                if (textDisplay.getText().contains("."))
                {
                    double pm = Double.parseDouble(textDisplay.getText());
                    pm = -1 * pm;
                    textDisplay.setText(String.valueOf(pm));
                } else
                {
                    long PM = Long.parseLong(textDisplay.getText());
                    PM = -1 * PM;
                    textDisplay.setText(String.valueOf(PM));

                }
            }
        });
        button20.addActionListener(new ActionListener() { // botao de virgula
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!textDisplay.getText().contains("."))
                    textDisplay.setText(textDisplay.getText() + button20.getText());
            }
        });
        a4Button.addActionListener(new ActionListener() { // botao de soma
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(textDisplay.getText());
                op = "+";
                textDisplay.setText("");
            }
        });
        a8Button.addActionListener(new ActionListener() { // botao de subtracao
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(textDisplay.getText());
                op = "-";
                textDisplay.setText("");
            }
        });
        xButton.addActionListener(new ActionListener() { // botao de multiplicacao
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(textDisplay.getText());
                op = "*";
                textDisplay.setText("");
            }
        });
        button11.addActionListener(new ActionListener() { // botao de divisao
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(textDisplay.getText());
                op = "/";
                textDisplay.setText("");
            }
        });
        button6.addActionListener(new ActionListener() { // botao de apagar
            @Override
            public void actionPerformed(ActionEvent e) {
                String backspace = null;

                if (textDisplay.getText().length() > 0)
                {
                    StringBuilder strB = new StringBuilder(textDisplay.getText());
                    strB.deleteCharAt(textDisplay.getText().length() - 1);
                    backspace = String.valueOf(strB);
                    textDisplay.setText(backspace);
                }
            }
        });
        a00Button.addActionListener(new ActionListener() { // botao 00
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a00Button.getText());
            }
        });
        button5.addActionListener(new ActionListener() {// igualdade
            @Override
            public void actionPerformed(ActionEvent e) {
                b = Double.parseDouble(textDisplay.getText());

                if (Objects.equals(op, "+"))
                {
                    result = a + b;
                    textDisplay.setText(String.valueOf(result));
                } else if (Objects.equals(op, "-"))
                {
                    result = a - b;
                    textDisplay.setText(String.valueOf(result));
                }else if (Objects.equals(op, "*"))
                {
                    result = a * b;
                    textDisplay.setText(String.valueOf(result));
                }else if (Objects.equals(op, "/"))
                {
                    result = a / b;
                    textDisplay.setText(String.valueOf(result));
                }
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
