package randomNumbers;
import java.util.Scanner;

import static java.lang.System.out;

public class GuessingGame {

    /*
    If the guessed number is bigger than the actual number, the program will respond with the message
    that the guessed number is higher than the actual number.
    If the guessed number is smaller than the actual number, the program will respond with the message
    that the guessed number is lower than the actual number.
    If the guessed number is equal to the actual number or if the K trials are exhausted,
    the program will end with a suitable message.
*/
    public static void main(String[] args) {
        guessingNumberGame();
    }
    public static void guessingNumberGame() {

        // Scanner class
        Scanner sc = new Scanner(System.in);

        //Generate the numbers between 0 and 10
        int number = (int) (21 * Math.random());
//        out.println(number);

        if (number < 10) {
            out.println("0" + number);
        }else
            out.println(number);

        //Given k trials
        int k = 5;
        sc.close();
    }

}
