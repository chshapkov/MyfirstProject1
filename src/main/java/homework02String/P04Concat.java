package homework02String;

import java.util.Scanner;

// from Lecture 05:
/* Обединете 2 и повече стринга в един и го изпишете в конзолата. */
public class P04Concat {
    public static void main(String[] args) {

        //Solution1
        String string1 = "Chavdar ";
        String string2 = "Strahilov ";
        String string3 = "Shapkov ";

        System.out.println(string1.concat(string2.concat(string3)));

        //Solution2
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your forename and enter Space and Enter after it: ");

        String stringForename = scanner.nextLine();

        System.out.println("Enter your middle name and enter Space and Enter after it: ");

        String stringMiddleName = scanner.nextLine();

        System.out.println("Enter your surname and enter Space and Enter after it: ");

        String stringSurname = scanner.nextLine();

        System.out.printf("Your name is %s.\n", stringForename.concat(stringMiddleName.concat(stringSurname)));


    }
}
