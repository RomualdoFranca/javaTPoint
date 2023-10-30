package Arrays;

public class CopyArray {
    public static void main(String[] args) {

        char[] copyFrom = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        //declare a destination
        char[] copyTo = new char[3];

        // Definindo os elementos que serao copiados
        /* A array que vai receber os dados da array original tem espaco para 3 elementos (char[3])

        *  srcPost: indica a partir de qual indice da array original os dados devem ser copiados
        * Ex: se srcPost:0, significa que a copia dos elementos se iniciara no indice zero da array original.
        * Ou seja, a copia sera a patir do preimeiro elemento
          destPost: indica em a partir de qual indice, na nova array, os elementos copiados devem ser inseridos
          Ex: se destPost:0 e length:3 numa array[3] com 3 espaços para alocar elementos, não havera erro
          length:3 é a quantidade de espaco disponivel para alocar os dados copiados
        */
        System.arraycopy(copyFrom, 0, copyTo, 1 , 2);
        System.out.println(String.valueOf(copyTo));
    }
}
