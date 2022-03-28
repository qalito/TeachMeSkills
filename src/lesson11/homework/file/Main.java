package lesson11.homework.file;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        FileUtil fileCreator = new FileUtil();
        File file = fileCreator.crateFile("./src/lesson11/homeWork/file/file.txt");
        String content = new String(InputOutputUtil.inputFile(file));
        System.out.println("File:\n" + content);
        File resultFile = fileCreator.crateFile("./src/lesson11/homeWork/file/task.txt");
        content =TextFormater.changeText(content);
        InputOutputUtil.outputFile(resultFile,content);
        System.out.println("File task:\n" + content);
    }
}
