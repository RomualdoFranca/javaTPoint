package Exemplo1;

import java.util.Scanner;

public class IntegerSumExemple1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter a second number: ");
        int b = scanner.nextInt();

        scanner.close();
//        It will return the sum of a and b
        System.out.println("The sum of a and b is = " + Integer.sum(a, b));


    }
}
