package constructors;

//Java program to overload constructors
public class FormulasFiguras {

    // futuras implementacoes: criar metodos para calcular a area de cada figura plana
    // implementar laços para escolher o metodo correspondente a figura desejada
    int medidaA;
    int medidaB;
    int medidaC;

    //creating one arg constructor
    FormulasFiguras(int i) {
        medidaA = i;
    }

    //creating two arg constructor
    FormulasFiguras(int i, int j) {
        medidaA = i;
        medidaB = j;
    }

    //creating three arg constructor
    FormulasFiguras(int i, int j, int k) {
        medidaA = i;
        medidaB = j;
        medidaC = k;
    }
    void calculaAreaQuadrado() {
        System.out.println("Area quadrado = " + medidaA * medidaA);
    }

    void calcularAreaRetangulo() {
        System.out.println("Area retângulo = " + medidaA * medidaB);
    }

    void calculaAreaTrapezio() {
        System.out.println("Area trapézio = " +  (medidaC * ( medidaA + medidaB)) / 2);
    }

    public static void main(String[] args) {
        //creating objects and passing values
        FormulasFiguras quadrado = new FormulasFiguras(7);
        quadrado.calculaAreaQuadrado();
        //creating objects and passing values
        FormulasFiguras retangulo = new FormulasFiguras(4, 5);
        retangulo.calcularAreaRetangulo();
        //creating objects and passing values
        FormulasFiguras trapezio = new FormulasFiguras(15, 22, 12);
        trapezio.calculaAreaTrapezio();
    }
}
