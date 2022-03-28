package lesson3;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        //определить четное ли число ввод числ пока число не кратно 7ми
        Scanner scanner = new Scanner(System.in);
        int b;
        while (true) {
            b = scanner.nextInt();
            System.out.println(b % 2 == 0 ? "четное" : "нечетное");
            if (b % 7 == 0) {
                break;
            }
        }
    }
}
