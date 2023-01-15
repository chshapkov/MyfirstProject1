package homework02String;

import java.util.Scanner;

// from Lecture 05:
/* Сравнете 2 стринга дали са еднакви - подадени от конзолата и изпишете резултата в нея.*/
public class P02Comparing {

    public static void main(String[] args) {

        //Solution1
        String string1 ="Chavdar";
        String string2 ="Peter";

        System.out.println(string1.equals(string2));

        System.out.println(string1 == string2);

        //Solution2
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word: ");
            String word1 = scanner.nextLine();

        System.out.println("Enter another word: ");
            String word2 = scanner.nextLine();

        System.out.printf("The two words are equal: %b\n", word1.equals(word2));
    }
}
