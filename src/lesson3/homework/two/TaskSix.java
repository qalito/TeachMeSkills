package lesson3.homework.two;

public class TaskSix {
    public static void main(String[] args) {
        /*Напишите программу вывода всех четных чисел от 2 до 100
        включительно*/
        for (int i = 2; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        for (int i = 2; i < 101; i += 2) {
            System.out.println(i);
        }

    }
}