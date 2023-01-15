package homework04Arrays;

import java.util.Arrays;

//from lecture 07:
/* Напишете програма, която изчислява средната стойност от всички числа в масив */

public class P02AverageInArray {
    public static void main(String[] args) {

        int[] numbers = {29, 11, 16, -20};

        System.out.println(Arrays.stream(numbers).average());
    }
}
