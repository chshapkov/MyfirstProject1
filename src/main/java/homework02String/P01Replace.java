package homework02String;

// from Lecture 05:

import java.util.Scanner;

/*Заместете даден под-string в даден string с друг текст:
Пример: “My name is <myName>” – заместете Test с нещо, което чете от конзолата.
*/
public class P01Replace {
    public static void main(String[] args){


        //Solution1
        String name = "Chavdar";
        System.out.printf("My name is %s.\n", name);

        //Solution2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name2 = scanner.nextLine();
        System.out.printf("My name is %s.\n", name2);

    }
}
