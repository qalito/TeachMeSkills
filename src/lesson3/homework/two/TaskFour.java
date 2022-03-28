package lesson3.homework.two;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        /*Составьте программу, вычисляющую A*B, не пользуясь операцией
        умножения.*/
        Scanner scanner = new Scanner(System.in);
        int num = 0, a, b;
        System.out.println("Введите a");
        a = scanner.nextInt();
        System.out.println("Введите b");
        b = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            num = num + b;
        }
        System.out.printf("Rez = %d ", num);
    }
}