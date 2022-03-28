package lesson14.thread.array;

import java.util.Scanner;

public class Main {
    /*  Условие задачи.
    Пользователь вводит с клавиатуры значение в массив.
    После чего запускаются два потока.
    Первый поток находит максимум в массиве, второй — минимум.
    Результаты вычислений возвращаются в метод main().*/
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write array length:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Write Array["+i+"]:");
            array[i]=scanner.nextInt();
        }
        ArrayUtil arrayUtil = new ArrayUtil(array);
        ArrayMinRunnable min = new ArrayMinRunnable(arrayUtil);
        ArrayMaxRunnable max = new ArrayMaxRunnable(arrayUtil);
        Thread minThread = new Thread(min);
        Thread maxThread =new Thread(max);
        minThread.start();
        maxThread.start();
        minThread.join();
        maxThread.join();
        System.out.println("Array  max:"+max.getValue()+", min:"+min.getValue());
    }
}
