package lesson5.homework.task.onedimensional;

import java.util.Random;

public class TaskFive {
    public static void main(String[] args) {
        /*5)Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый,
        выведите массивы на экран в двух отдельных строках. Посчитайте среднее
        арифметическое элементов каждого массива и сообщите, для какого из
        массивов это значение оказалось больше (либо сообщите, что их средние
        арифметические равны).*/
        int array1[] = new int[5];
        int array2[] = new int[5];
        double rez1 = 0, rez2 = 0;
        Random random = new Random();
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(16);
            array2[i] = random.nextInt(16);
        }
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
            rez1 += array1[i];
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
            rez2 += array2[i];
        }
        rez1=rez1/array1.length;
        rez2=rez2/array2.length;
        System.out.println("\nAverage array1 = "+rez1+", array2 ="+rez2);
        System.out.println("Average "+(rez1>rez2?"array1 more than array2":rez2>rez1?"array1 more than array2":"Average array1 = array2"));


    }
}
