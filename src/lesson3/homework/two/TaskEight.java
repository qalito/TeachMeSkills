package lesson3.homework.two;

public class TaskEight {
    public static void main(String[] args) {
        /*8) И ещё можете попрактиковаться и нарисовать оставшиеся 2
            треугольника
             *
             * * (1)
             * * *
             * * * *

             * * * *
             * * * (2)
             * *
             *
             */
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");

        for (int i = 4; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 ; j++) {
                if (j<i) System.out.print("  ");
                else  System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");

        for (int i = 4; i > 0; i--) {
            for (int j = 0; j < 4; j++) {
                if (j<i-1) System.out.print("  ");
                else  System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
