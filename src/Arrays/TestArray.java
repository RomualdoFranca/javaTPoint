package Arrays;

public class TestArray {
    public static void main(String[] args) {

        int a[] = new int[3]; // declaration and instantiation

        a[0] = 1; // initialization
        a[1] = 2;
        a[2] = 3;
        System.out.println(a[0]); // output do elemento indicado no indice da array

        // O 'i' representa o indice da array. Enquanto o indice da array for menor que o tamanho da array, adiciona +1 ao indice
        // dessa maneira, o laco percorre todos os elementos da array
        System.out.println("Array a");
        for (int i = 0; i < a.length; i++){
            System.out.printf("Indice %d = %d: \n", i,  a[i]); // output de todos os elementos da array
        }

        //Declaration, Instantiation and Initialization
        int b[] = {10, 20, 30, 40};
        //print array
        System.out.println("Array b");
        for (int i = 0; i < b.length; i++) {
            System.out.printf("Indice %d = %d: \n", i, b[i]);
        }
        //printing array using for-each loop
        System.out.println("Printing array using for-each loop  ");
        for (int i : b) {
            System.out.println(i);
        }



    }
}
