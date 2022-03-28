package lesson2;

import java.util.Scanner;

public class TaskTwo {

    public static void main(String[] args) {
        // Создать переменную, присвоить ей значение, если переменная больше 5, пишу s, если больше 10 нечетное l, если больше 10 и четное xl, иначе ничего.
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num > 5 && num <= 10) {
            System.out.println("S");
        } else if (num > 10 && num % 2 != 0) {
            System.out.println("L");
        } else if (num > 10 && num % 2 == 0) {
            System.out.println("XL");
        } else {
            System.out.println("Nothing");
        }
    }
}
