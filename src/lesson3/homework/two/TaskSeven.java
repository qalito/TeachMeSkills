package lesson3.homework.two;

public class TaskSeven {
    public static void main(String[] args) {
        /*Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99*/
        int sum = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println("Sum=" + sum);
    }
}