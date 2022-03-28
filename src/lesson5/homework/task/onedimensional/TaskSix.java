package lesson5.homework.task.onedimensional;

import java.util.Random;

public class TaskSix {
    public static void main(String[] args) {
        /*6)Создайте массив из 4 случайных целых чисел из отрезка [0;10], выведите его
        на экран в строку. Определить и вывести на экран сообщение о том, является ли
        массив строго возрастающей последовательностью.*/
        int array[] = new int[4];
        boolean asc = true;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(11);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                asc = false;
                break;
            }
        }
        System.out.println(asc?"Strictly decreasing sequence":"No strictly decreasing sequence");
    }
}
