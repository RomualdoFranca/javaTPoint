package Arrays;

public class MultidimensionalArray {

    public static void main(String[] args) {

        int[][] multidimentionalArray = new int[3][3]; // 3 rows and 3 column

        // Uma array multidimensional 2D é como se fosse uma tabela
        // 1° colchete representa as linhas. 2° colchete, as colunas
        //initialize an Multidimensional  array

        multidimentionalArray[0][0] = 9; // 1° linha e 1° coluna
        multidimentionalArray[0][1] = 8; // 1° linha segunda coluna
        multidimentionalArray[0][2] = 7; // 1° linha terceira coluna

        multidimentionalArray[1][0] = 6;
        multidimentionalArray[1][1] = 5;
        multidimentionalArray[1][2] = 4;

        multidimentionalArray[2][0] = 3;
        multidimentionalArray[2][1] = 2;
        multidimentionalArray[2][2] = 1;

        print2DArray(multidimentionalArray);
        System.out.println();
        // declarando e iniciando uma array multidimensional 2D
        // vizualizar uma tabela 3x3 onde cada conjunto representa uma linha e cada numero do conjunto é inserido em uma coluna
        /*Elementos da 1° linha {1,2,3}*/
        /*Elementos da 2° linha {4,5,6}*/
        /*Elementos da 3° linha {7,8,9}*/
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        print2DArray(arr);
        System.out.println();

        // o numero de linhas deve ser igual ao numero de coluna
        String[][] cadastro = {{"L1-C1", "L1-C2", "L1-C3"}, {"L2-C1", "L2-C2", "L2-C3"},{"L3-C1", "L3-C2", "L3-C3"}};
        printStringArray(cadastro);
    }
    static void  print2DArray(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }

    static void printStringArray(String arr[][]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
