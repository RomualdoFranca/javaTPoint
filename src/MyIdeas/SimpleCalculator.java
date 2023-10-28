package MyIdeas;

import java.util.Scanner;

import static java.lang.System.out;


public class SimpleCalculator {

    /*Futuras implementacoes:
    * Aplicar tratamento de excessoes
    * Implementar fluxo de controle para realizar varias operacoes
    * Operacoes com numeros decimais
    * */
    public static void main(String[] args) {

        Scanner inputNumbers = new Scanner(System.in);

        int a,b;
        out.println("Enter the two numbers: ");
        a = inputNumbers.nextInt();
        b = inputNumbers.nextInt();

        int option =  chooseOperation();

        inputNumbers.close();

        if (option == 1) {
            out.println("The sum is = " + addNumbers(a, b));
        } else if (option == 2) {
            out.println("The subtraction is = " + sbtractNumbers(a, b));
        } else if (option == 3) {
            out.println("The multiplication is = " + multiplyNumbers(a, b));
        }else
            out.println("The division is = " + divisionNumbers(a, b));


    }

    static int chooseOperation() {

        Scanner readOption = new Scanner(System.in);

        out.println("Choose the mathematical operation\n1 to add\n2 to subtract\n3 to multiply\n4 to division");
        int option =  readOption.nextInt();
        readOption.close();

        return option;
    }

    static int addNumbers(int num1, int num2) {

        return num1 + num2;
    }

    static int sbtractNumbers(int num1, int num2) {

        if (num1 > num2) {
            return num1 - num2;
        }
        return num2 - num1;
    }

    static int multiplyNumbers(int num1, int num2) {
        return num1 * num2;
    }

    static int divisionNumbers(int numerador, int denominador) {
        if (denominador == 0) {
            out.println("Impossible to divide by zero");
        }
        return numerador / denominador;
    }

}
