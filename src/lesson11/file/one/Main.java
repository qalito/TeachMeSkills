package lesson11.file.one;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        FileUtil dir = new FileUtil();
        dir.dirCrator("D://Serg");
        FileUtil fileCreator = new FileUtil();
        File file = fileCreator.crateFile("D://Serg/Serg.txt");
        String text = "Serg";
        InputOutputUtil.outputFile(file, text);
        text = new String(InputOutputUtil.inputFile(file));
        System.out.println("File:" + text);
        text = text.replace('e', 'i');
        InputOutputUtil.outputFile(file, text);
        text = new String(InputOutputUtil.inputFile(file));
        System.out.println("File:" + text);
    }
}
