package Arrays;

public class TestArrayMethod {
    //Java Program to demonstrate the way of passing an array to method.
    public static void main(String[] args) {

        int b[] = {10, 20, 30, 40};
        int c[] = {5, 4, 3, 2, 1};

        min(b);
        printArray(c);

    }

    //creating a method which receives an array as a parameter
    static void min(int arr[]) {

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) { // logica para percorrer todos os elementos da array na sequencia

            if (min < arr[i]) {
                min = arr[i];
            }
            System.out.printf("Indice %d = %d: \n", i, min);
//            System.out.println(min);
        }
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }

    }
}
