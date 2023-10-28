package jogoDoBicho;

public class GerarDezenas {

    public static void main(String[] args) {

//        geraNumeros0a9();
        int randomNumber = geraNumeros0a9();
        System.out.println("gera numbers = " + randomNumber);
//        System.out.println(defineGrupo(randomNumber));
        System.out.println(converteString(randomNumber));

        if ((randomNumber > 0) && (randomNumber < 5)) {
            System.out.printf("Dezena: 0%d\nGrupo: 01\nAvestruz\n", randomNumber);
        }else
            System.out.printf("Dezena: 0%d\nGrupo: 02\nÁguia\n", randomNumber);
    }

    static int geraNumeros0a9() {

        int unidades = 1 + (int) (10 * Math.random());
//        System.out.println("0" + unidades);
        return unidades;
    }

    static String converteString(int random) {
//        random = geraNumeros0a9();
        String s = String.valueOf("Converte String 0" + random);
        return s;

    }


}
