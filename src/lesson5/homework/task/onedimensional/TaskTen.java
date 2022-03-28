package lesson5.homework.task.onedimensional;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskTen {
    public static void main(String[] args) {
        /*10)Пользователь вводит с клавиатуры число большее 3, которое сохраняется в
        переменную n. Если пользователь ввёл не подходящее число, то программа
        должна выдать соответствующее сообщение. Создать массив из n случайных
        целых чисел из отрезка [0;n] и вывести его на экран. Создать второй массив
        только из чётных элементов первого массива, если они там есть, и вывести его
        на экран.*/
        System.out.println("Input number bigger than 3");
        int n = new Scanner(System.in).nextInt();
        if (n < 4) {
            System.out.println("Input number is not > 3");
            return;
        }
        int[] array = new int[n];
        int evenCount = 0;
        for (int i = 0; i < n; i++) {
            array[i] = (int) (new Random().nextInt(n+1));
            if (array[i] % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println(Arrays.toString(array));

        int[] arrayTwo = new int[evenCount];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                arrayTwo[j++] = array[i];
            }
        }
        System.out.println(Arrays.toString(arrayTwo));
    }
}
