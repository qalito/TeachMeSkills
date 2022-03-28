package lesson3.homework.one;

import java.util.Scanner;

public class TaskSix0 {
    public static void main(String[] args) {
        /*6) Даны 2 числа. Вывести большее из них.*/
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        System.out.println("Enter number 1:");
        num1 = scanner.nextDouble();
        System.out.println("Enter number 2:");
        num2 = scanner.nextDouble();
        if (num1 > num2) {
            System.out.println("Number 1 = "+num1);
        } else if (num2 > num1) {
            System.out.println("Number 2 = "+num2);
        }
        else {
            System.out.println("Number 1 = Number 2 = "+num1);
        }
    }
}
