package homework04Arrays;

//from Lecture 7

/* Напишете програма, която приема масив от числа и
изчислява сумата на всички четни и нечетни числа от поредицата изписвайки подходящо съобщение с резултата. */
public class P03 {

    //todo
    public static void main (String[]args){
        int[] nums = {1, 2, 3, 4, 5, 6};


        printArray(nums);
        printEvenFromArray(nums);
        printOddFromArray(nums);
        // printEvenOdd(nums);
        //  printSumEvenOfArray(nums); не!

    }

    public static void printEvenOdd(int[] evenOddArray) {
        for (int evenOddNumber : evenOddArray) {
            if (evenOddNumber % 2 == 0) {
                System.out.println(evenOddNumber + evenOddNumber);
                evenOddNumber++;
            } else {
                System.out.println("Odd: " + evenOddNumber);
            }
        }
        System.out.println(".......................");
    }

    public static void printArray ( int[] allArray){
        for (int allNumsOfArray : allArray) {
            System.out.println("elements of array: " + allNumsOfArray);
        }

        System.out.println("..................");
    }


    public static void printEvenFromArray ( int[] allArray){
        for (int allNumsOfArray : allArray) {
            if (allNumsOfArray % 2 == 0) {
                System.out.println("Even elements of even array: " + allNumsOfArray);
            }

        }
        System.out.println("..................");
    }


    public static void printOddFromArray ( int[] allArray){
        for (int allNumsOfArray : allArray) {
            if (allNumsOfArray % 2 != 0) {
                System.out.println("Odd elements of array: " + allNumsOfArray);
            }
        }
    }

    //NOT!
    //    public static void printSumEvenOfArray ( int[] allArray) {
//        int sumEven = 0;
//        for (int i = 0; i < allArray.length; i++) {
//                while (i % 2 == 0) { //кога искаме да спрем?
//                sumEven += i; // искаме да спрем, когато
//                i++;
//            }
//            System.out.println("Sum of the even in array is: " + sumEven); //must be 12
//        }
//    }

}
