package lesson5.homework.task.onedimensional;

import java.util.Random;

public class TaskSeven {
    public static void main(String[] args) {
        /*7)Создайте массив из 12 случайных целых чисел из отрезка [0;15]. Определите
        какой элемент является в этом массиве максимальным и сообщите индекс его
        последнего вхождения в массив.*/
        int array[] = new int[12];
        int max = 0, index = 0;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(16);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
                index = i;
            }
        }
        System.out.println();
        System.out.println("Max = "+max+", index = "+index);
    }
}
