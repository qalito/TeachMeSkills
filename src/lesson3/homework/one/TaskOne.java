package lesson3.homework.one;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        /*1) В переменную записываем число. Надо вывести на экран сколько в этом
        числе цифр и положительное оно или отрицательное. Например, "это
        однозначное положительное число". Достаточно будет определить, является ли
        число однозначным, "двухзначным или трехзначным и более.*/
        Scanner scanner = new Scanner(System.in);
        int number, i;
        System.out.println("Enter number: ");
        number = scanner.nextInt();
        boolean positive = number > 0 ? true : false;
        boolean zero = number == 0 ? true : false;
        if (number == 0) {
            System.out.print("Zero, ");
        } else if (number < 0) {
            System.out.print("Negative, ");
        } else {
            System.out.print("Positive, ");
        }
        for (i = 0; number != 0; i++) {
            number = number / 10;
        }
        switch (i) {
            case 0:
            case 1: {
                System.out.print("single-digit number.");
                break;
            }
            case 2: {
                System.out.print("two-digit number.");
                break;
            }
            case 3: {
                System.out.print("three-digit number.");
                break;
            }
            default: {
                System.out.print("more then three-digit number: " + i + "-digit number.");
            }
        }
    }
}
