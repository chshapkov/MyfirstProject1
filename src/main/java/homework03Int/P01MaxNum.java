package homework03Int;

import java.util.Scanner;

// from Lecture 06:
/*Напишете програма/ метод, която приема от конзолата 3 подадени числа определя кое е най-голямото. */
public class P01MaxNum {
    public static void main(String[] args) {

        //solution 01:
        int x = 11;
        int y = 22;
        //and
        int z = 33;
        System.out.printf("Between the numbers entered %d and %d, the larger is %d.\n", x, y, Math.max(x, y)); // най-голямото от 2 подадени числа

        System.out.printf("Between the numbers entered %d, %d and %d, the larger is %d.\n", x, y, z, Math.max(x, Math.max(y, z))); //най-голямото от 3 подадени числа

        //solution 02:
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter а second number: ");
        int number2 = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter a third number: ");
        int number3 = Integer.parseInt(scanner.nextLine());

        System.out.printf("Between the numbers entered %d, %d and %d, the larger is %d.\n", number1, number2, number3, Math.max(number1, Math.max(number2, number3)));

        //solution 03:
        int int1 = 48;
        int int2 = 38;
        int int3 = 28;
        System.out.println("Max Number is: " + maxNum(maxNum(int1, int2), maxNum(int2, int3)));
        //OR:
        System.out.println("Max Number is: " + maxNum(maxNum(3, 5), maxNum(5, 7)));
    }

    //(solution 03 - method):
    public static int maxNum(int a, int b) {
        if (a > b) {
            return a;
        }else {
            return b;
        }
    }
}
