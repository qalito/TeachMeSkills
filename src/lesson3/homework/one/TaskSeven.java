package lesson3.homework.one;

import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {
        /*7) (Дополнительно) В переменную записываете количество программистов. В
        зависимости от количества программистов необходимо вывести правильно
        окончание. Например:
        • 2 программиста
        • 1 программиста
        • 10 программистов
        • и т.д.*/
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        for (number = 0; number <= 200; number++) {
            System.out.print(number + " программист");
            if ((number % 10 > 4) || (number % 10 == 0) || ((number % 100 > 10) && (number % 100 < 20))) {
                System.out.print("ов");
            } else if ((number % 10 > 1) && (number % 10 < 5)) {
                System.out.print("а");
            }
            System.out.println();
        }
    }
}
