//package i.e. location of the file
package programming.intro;


import java.util.Scanner;

// from Lecture 04:

/*Напишете програма, която:

Чете за име на потребител

Чете за любимо хоби на потребителя

Изписва в конзолата подходящо съобщение за потребителя и хобито
*/
public class intro {

    public static void main(String[] args) {


        System.out.println("Please enter your name:");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();



        System.out.println("Please enter your hobby:");

        String hobby = scanner.nextLine();

        System.out.println( "Hi, " + name + " your hobby is:" + hobby);

    }
    }

