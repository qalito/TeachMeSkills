package lessons22.array.task;

import java.util.Random;

//x*y 5-7 случайно, заполнить случаянно от 0 до 99, Вывести 3 строку
//сумма всех элементов двумерного массива
//дан двумерный масив содержащий отрицательные и положительные числ. Вывести номера яцеек содерж отрицательно число..

public class RandArray {
    public static void main(String[] args) {
        Random random = new Random();
        int m = random.nextInt(3) + 5; //((max - min) + 1) + min
        int n = random.nextInt(3) + 5;//((max - min) + 1) + min
        int sum = 0;
        int array[][] = new int[m][n];
        System.out.println("Size: " + m + "*" + n);
        System.out.println("Array:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100);
                sum += array[i][j];
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Array[3]:");
        for (int i = 0; i < array[2].length; i++) {
            System.out.print(array[2][i] + "\t");
        }
        System.out.println();
        System.out.println("Array sum:" + sum);
        System.out.println("Array:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(101) - 50;
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Negative array index:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0) {
                    System.out.print("[" + i + "][" + j + "]\t");
                }
            }
        }
    }
}
