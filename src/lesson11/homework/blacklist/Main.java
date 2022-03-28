package lesson11.homework.blacklist;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        FileUtil fileCreator = new FileUtil();

        File file = fileCreator.crateFile("./src/lesson11/homeWork/blacklist/file.txt");
        String content = new String(InputOutputUtil.inputFile(file));
        System.out.println("File:\n" + content);
        File fileBlackList = fileCreator.crateFile("./src/lesson11/homeWork/blacklist/blackList.txt");
        String blackContent = new String(InputOutputUtil.inputFile(fileBlackList));
        System.out.println("File blackList:" + blackContent);
        if (TextFormater.compareList(TextFormater.splitSentence(content, "[. ]"), TextFormater.splitSentence(blackContent, "[,]"))) {
            System.out.println("Correct Text!");
        }else {
            System.out.println("Obscene Text!");
        }
    }
}
