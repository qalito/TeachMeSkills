package lesson11.homework.blacklist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TextFormater {
    public static List<String> splitSentence(String text, String reg) {
        text = text.replace(System.getProperty("line.separator"), " ").replace(".", "");
        List<String> sentences = new ArrayList<String>(Arrays.asList(text.split(reg)));
        return sentences;
    }


    public static boolean compareList(List<String> list, List<String> blackList) {
        for (String word : list) {
            for (String blackWord : blackList) {
                if (blackWord.equals(word)){
                    return false;
                }
            }
        }
        return true;
    }
}
