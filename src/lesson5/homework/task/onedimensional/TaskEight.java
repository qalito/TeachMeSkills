package lesson5.homework.task.onedimensional;

import java.util.Arrays;
import java.util.Random;

public class TaskEight {
    public static void main(String[] args) {
        /*8)Создайте два массива из 10 целых случайных чисел из отрезка [0;9] и третий
        массив из 10 действительных чисел. Каждый элемент с i-ым индексом третьего
        массива должен равняться отношению элемента из первого массива с i-ым
        индексом к элементу из второго массива с i-ым индексом. Вывести все три
        массива на экран (каждый на отдельной строке), затем вывести количество
        целых элементов в третьем массиве.*/
        Random random = new Random();
        int[] arrayOne = new int[10];
        int[] arrayTwo = new int[arrayOne.length];
        double[] arrayThree = new double[arrayOne.length];

        int countOfWhole = 0;
        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = random.nextInt(10);
            arrayTwo[i] = random.nextInt(10);
            arrayThree[i] = (double) arrayOne[i] / arrayTwo[i];
            if (arrayThree[i] == (int) arrayThree[i]) {
                countOfWhole++;
            }
        }
        System.out.println(Arrays.toString(arrayOne));
        System.out.println(Arrays.toString(arrayTwo));
        System.out.println(Arrays.toString(arrayThree));
        System.out.println("Quantity of integers are " + countOfWhole);
    }
}
