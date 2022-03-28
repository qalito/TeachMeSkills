package lesson11.homework.file;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TextFormater {

    public static String changeText(String sentence) {
        StringBuilder result = new StringBuilder("");
        for (String sent : splitSentence(sentence)) {
            int count = checkCountWords(sent.trim());
            if (checkPalindrome(sent)) {
                result.append(sent);
            } else if (count > 2 && count < 6) {
                result.append(sent);
            }
        }
        return result.toString().trim();
    }

    private static List<String> splitSentence(String text) {
        text = text.replace(System.getProperty("line.separator"), " ");
        //Разбивается на каждую строку нулевой длины, перед которой точка ((?<=[.])), за которой следует пробел ((?=[ ])).
        List<String> sentences = new ArrayList<String>(Arrays.asList(text.split("(?<=[.])(?=[ ])")));
        return sentences;
    }

    private static int checkCountWords(String sentence) {
        int count = sentence.split("[ .]").length;
        return count;
    }

    private static boolean checkPalindrome(String sentence) {
        for (String sent : sentence.split("[ .]")) {
            if (palindromeWord(sent)) {
                return true;
            }
        }
        return false;
    }

    private static Boolean palindromeWord(String content) {
        for (int i = 0; i < content.length() / 2; i++) {
            if (content.charAt(i) != content.charAt(content.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
