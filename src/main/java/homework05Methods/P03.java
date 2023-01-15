package homework05Methods;

//from lecture 09:
/* Напишете метод, който на база въведени две числа връща средна стойност.//  ok
Напишете др метод, който приема два параметъра - числа, и връща сумата им. //ok
Извикайте втория метод с параметри първия. */ //todo
public class P03 {

    public static void main(String[] args) {
        returnAverage(7, 8);
        returnSum(5, 8);
        System.out.println("Сумата - Средната стойност: " + (returnSum(7,3) - returnAverage(4,6))); //не е поп условието


    }

    //този метод работи, но не е по условието
    public static float returnAverage (float a, float b) {
        System.out.printf("Average value of %.1f and %.1f is %.1f.\n", a, b, (a + b)/2);
        return (a + b)/2f;
    }


    //този метод работи, но не е по условието:
//    public static int returnAverageValue () {
//        int a = 0;
//        int b = 0;
//        System.out.printf("Average value of %d and %d is %d.\n", a, b, (a + b)/2);
//        return (a + b)/2;
    //   }

    public static float returnSum (float a, float b) {
        System.out.printf("The sum of %.1f and %.1f is %.1f.\n", a, b, (a + b));
        return a + b;
    }
}
