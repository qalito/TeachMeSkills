package lesson3.homework.one;

import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        /*5) Даны 3 целых числа. Найти количество положительных и отрицательных чисел в исходном наборе.*/
        Scanner scanner = new Scanner(System.in);
        int countNumber = 0, countPositive = 0, countNegative=0;
        System.out.println("Enter three number:");
        while (countNumber < 3) {
            int number = scanner.nextInt();
            if (number > 0) {
                countPositive++;
            } else if (number < 0) {
                countNegative++;
            }
            countNumber++;
        }
        System.out.println("Count positive numbers:" + countPositive+", count negative numbers:"+countNegative+".");
    }
}
