package lesson3.homework.one;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        /*2) Треугольник существует только тогда, когда сумма любых двух его сторон
        больше третьей. Определить существует ли такой треугольник. Дано: a, b, c –
        стороны предполагаемого треугольника. Требуется сравнить длину каждого
        отрезка-стороны с суммой двух других. Если хотя бы в одном случае отрезок
        окажется больше суммы двух других, то треугольника с такими сторонами не
        существует.*/
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter 3 length of sides of triangle:");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if ((a > b + c) && (b > c + a) && (c > b + a)) {
            System.out.println("Triangle does not exists.");
        } else {
            System.out.println("Triangle exists.");
        }

    }
}
