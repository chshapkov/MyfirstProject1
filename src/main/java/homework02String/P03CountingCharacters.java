package homework02String;

import java.util.Scanner;

// from Lecture 05:
/* Пребройте колко думи има в един стринг (разделете текста по space) - изпишете резултата в нея. */
public class P03CountingCharacters {
    public static void main(String[] args) {

        //Solution1
        String string1 = "Chavdar Shapkov";
        System.out.println(string1.length());

        //Solution2
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write something: ");

        String newString = scanner.nextLine();

        System.out.printf("The length of the text is %d characters.", newString.length());
    }
}
