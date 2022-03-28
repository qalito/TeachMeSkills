package lesson5.homework.task.onedimensional;

import java.util.Random;

public class TaskThree {
    public static void main(String[] args) {
        /*3)Создайте массив из 15 случайных целых чисел из отрезка [0; 99]. Выведите
        массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете
        это количество на экран на отдельной строке.*/
        byte count=0;
        int array[] = new int[15];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i]=random.nextInt(100);
            if (array[i]%2==0){
                count++;
            }
        }
        System.out.println("Array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.print("\nCount:"+count);
    }
}
