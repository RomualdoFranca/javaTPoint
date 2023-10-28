package jogoBichoII;

import java.util.Scanner;

public class Banca1 {

    public static void main(String[] args) {

        int milharCentena = geraDezenaEUnidade();
        int dezenaUnidade = geraDezenaEUnidade();

        System.out.println("Milhar e centena = " + milharCentena);
        System.out.println("Dezena e unidade = " + dezenaUnidade);
        //
        comparaResultados(geraAposta(), geraMilhar(milharCentena, dezenaUnidade));

//        System.out.println("Resultado: " + resultado);
        System.out.println("Resultado final milhar = " + geraMilhar(milharCentena, dezenaUnidade));
    }

    //criar metodo para definir grupo

    //metodo para gerar os numeros da milhar e . Se o numero for menor que 10, acrescentar 0 na conversao para string
    public static int geraDezenaEUnidade() {

        return (int) (100 * Math.random());
    }

    //metodo com gera o resultado da banca, em milhar, convertido em string
    public static String geraMilhar(int milharCentena, int dezenaUnidade) {

        String s;
        if (milharCentena < 10 && dezenaUnidade < 10) {
            s = String.valueOf("0" + milharCentena + "0" + dezenaUnidade);
            return s;
        } else if (milharCentena < 10) {
            s = String.valueOf("0" + milharCentena + dezenaUnidade);
            return s;
        } else if (dezenaUnidade < 10) {
            s = String.valueOf( milharCentena + "0" + dezenaUnidade);
            return s;
        }
        return String.valueOf(milharCentena + "" + dezenaUnidade);

    }

    //metodo para input do jogador
    public static String geraAposta() {
        String aposta;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira sua aposta");
        aposta = sc.nextLine();

        return aposta;
    }
    //metodo comparando a aposta com o resultado da banca

    public static void comparaResultados(String aposta, String banca) {

        if (!aposta.equals(banca)) {
            System.out.println("Nenhuma premiação para essa aposta");
        }else
            System.out.println("Bilhete premiado");
    }
    //metodo com controle de fluxo que gere 5 jogos
}
