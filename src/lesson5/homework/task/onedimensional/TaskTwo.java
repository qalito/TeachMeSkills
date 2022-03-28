package lesson5.homework.task.onedimensional;

public class TaskTwo {
    public static void main(String[] args) {
        /*2)Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в
        строку, а затем этот же массив выведите на экран тоже в строку, но в обратном
        порядке (99 97 95 93 … 7 5 3 1).*/
        int array[] = new int[50];
        int j = 0;
        for (int i = 1; i < 100; i += 2) {
            array[j] = i;
            j++;
        }
        System.out.println("Array 1:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nArray 2:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
