package lesson5.homework.task.onedimensional;

import java.util.Random;

public class TaskFour {
    public static void main(String[] args) {
        /*4)Создайте массив из 20 случайных целых чисел из отрезка [0;20]. Выведите
        массив на экран в строку. Замените каждый элемент с нечётным индексом на
        ноль. Снова выведете массив на экран на отдельной строке.*/
        int array[] = new int[20];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21);
        }
        System.out.println("Array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = 0;
            }
        }
        System.out.println("\nArray:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
