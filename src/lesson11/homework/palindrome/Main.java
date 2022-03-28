package lesson11.homework.palindrome;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        FileUtil fileCreator = new FileUtil();
        File file = fileCreator.crateFile("./src/lesson11/homeWork/palindrome/file.txt");
        String content = "tvt\nqwerty\ntioit\ntut\nzxcvbn\nmadam\n";
        InputOutputUtil.outputFile(file, content);
        content = new String(InputOutputUtil.inputFile(file));
        System.out.println("File:\n" + content);
        File filePalindrome = fileCreator.crateFile("./src/lesson11/homeWork/palindrome/palindrome.txt");
        content =TextFormater.findPalindromeInList(InputOutputUtil.linesInput(file));
        InputOutputUtil.outputFile(filePalindrome, content);

    }
}
