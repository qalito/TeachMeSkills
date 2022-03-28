package lesson11.homework.palindrome;

import java.util.List;

public class TextFormater {
    private static Boolean palindromeWord(String content) {
        for (int i = 0; i < content.length() / 2; i++) {
            if (content.charAt(i) != content.charAt(content.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static String findPalindromeInList(List<String> lines) {
        StringBuilder content= new StringBuilder("");
        for (int i = 0; i < lines.size(); i++) {
            if (palindromeWord(lines.get(i))) {
                content.append(lines.get(i)+"\n");
            }
        }
        return content.toString();
    }
}
