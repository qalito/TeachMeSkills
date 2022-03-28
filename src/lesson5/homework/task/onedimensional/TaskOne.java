package lesson5.homework.task.onedimensional;

public class TaskOne {
    public static void main(String[] args) {
        /*    Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы
        массива на экран сначала в строку, отделяя один элемент от другого пробелом, а
        затем в столбик (отделяя один элемент от другого началом новой строки). Перед
        созданием массива подумайте, какого он будет размера.*/
        int array1[] = new int[10];
        int array2[] = new int[10];
        int j = 0;
        for (int i = 2; i < 21; i += 2) {
            array1[j] = i;
            j++;
        }
        j = 0;
        for (int i = 1; i < 21; i++) {
            if (i % 2 == 0) {
                array2[j] = i;
                j++;
            }
        }
        System.out.println("Array 1:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println("\nArray 2:");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i] + " ");
        }
    }
}
