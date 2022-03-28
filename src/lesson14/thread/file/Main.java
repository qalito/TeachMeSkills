package lesson14.thread.file;

import java.io.File;

public class Main {
    /*
      2-Условие задачи.
      Заданы три целочисленных массива.
      Записать эти массивы в файл в паралельних потоках.
      Создать класс SaveAsThread для представления потока, который записывает целочисленный массив в файл.
  */
    public static void main(String[] args) throws InterruptedException {
        int[] arrayOne = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arrayTwo = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] arrayThree = {3, 2, 1, 4, 5, 6, 7, 8, 9};
        FileUtil fileCreator = new FileUtil();
        File file = fileCreator.crateFile("./src/lesson14/thread/file/file.txt");
        Thread threadOne = new Thread(new SaveAsThread(arrayOne, file));
        Thread threadTwo = new Thread(new SaveAsThread(arrayTwo, file));
        Thread threadThree = new Thread(new SaveAsThread(arrayThree, file));
        threadOne.start();
        threadTwo.start();
        threadThree.start();
        threadOne.join();
        threadTwo.join();
        threadThree.join();
        System.out.println("File:\n" + new String(InputOutputUtil.inputFile(file)));
    }
}
