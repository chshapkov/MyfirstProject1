package homework04Arrays;

import java.util.Scanner;

//from lecture 07
/* Напишете програма (метод), която отпечатва на конзолата числата от 1 до N.
Числото N се приема като параметър. */
public class P04 {
    public static void main(String[] args) {

        //solution01:
        printFrom1toN(5); //todo не мога да въведа неопределен брой параматри

        //solution02:
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number from 1 to 100:");
        int number = Integer.parseInt(scanner.nextLine());
        if (number <= 0) {
            System.out.printf("You entered %d. Please enter a number from 1 to 100.\n", number);
        } else {
            System.out.printf("The number you entered is %d.\n", number);
        }

    }

    //Method (solution02):

    public static void printFrom1toN (int from1toN) {
        System.out.println("You entered: " + from1toN);

    }
}
