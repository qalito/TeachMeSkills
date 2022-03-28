package lesson3.homework.one;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        /*4) Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.*/
        Scanner scanner = new Scanner(System.in);
        int countNumber = 0, countPositive = 0;
        System.out.println("Enter three number:");
        while (countNumber < 3) {
            int number = scanner.nextInt();
            if (number > 0) {
                countPositive++;
            }
            countNumber++;
        }
        System.out.println("Count positive numbers:" + countPositive);
    }
}
