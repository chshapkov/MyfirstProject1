package homework04Arrays;

import java.util.Scanner;

//from lecture 07:
/* Напишете програма, която отпечатва на конзолата числата от 1 до N, които не се делят на 3 и 7. */
public class P05NotDivBy3and7 {
    public static void main(String[] args) {

        //solution01:
        System.out.println(".......solution1.......");
        notDivisibleBy3and7WhitParam(5);

        //solution 2:
        System.out.println(".......solution3.......");
        int[] nums = {1, 3, 7, 12, 21, 22};
        notDivisibleBy3and7(nums);

        //solution 3:
        System.out.println(".......solution2.......");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to check if it is divisible by 3 and 7:");
        int number = Integer.parseInt(scanner.nextLine());
        if (number <= 0) {
            System.out.println("Enter valid number.");
        } else if (!(number % 3 == 0) && !(number % 7 == 0)) {
            System.out.printf("% d is not divisible by 3 and 7.\n", number);
        } else if ((number % 3 == 0) && !(number % 7 == 0)) {
            System.out.printf("% d is divisible by 3.\n", number);
        } else if (!(number % 3 == 0) && (number % 7 == 0)) {
            System.out.printf("% d is divisible by 7.\n", number);
        } else {
            System.out.printf("%d is divisible by 3 and 7.\n", number);
        }

    }

    //Method (solution 1):
    public static int notDivisibleBy3and7WhitParam(int param) {
        if (param <= 0) {
            System.out.println("Enter valid number.");
        } else if (!(param % 3 == 0) && !(param % 7 == 0)) {
            System.out.printf("% d is not divisible by 3 and 7.\n", param);
        } else if ((param % 3 == 0) && !(param % 7 == 0)) {
            System.out.printf("% d is divisible by 3.\n", param);
        } else if (!(param % 3 == 0) && (param % 7 == 0)) {
            System.out.printf("% d is divisible by 7.\n", param);
        } else {
            System.out.printf("%d is divisible by 3 and 7.\n", param);
        }
        return param;
    }

    //Method (solution 2):
    public static void notDivisibleBy3and7(int[] notDivBy3and7) {
        for (int notBy3and7 : notDivBy3and7) {
            if (!(notBy3and7 % 3 == 0) && !(notBy3and7 % 7 == 0)) {
                System.out.println("Not Divisible By 3 and 7: " + notBy3and7);
            }
        }
    }
}
