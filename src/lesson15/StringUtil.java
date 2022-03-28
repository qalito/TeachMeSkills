package lesson15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.lang.Integer.parseInt;

public class StringUtil {
    public static HashSet<Integer> splitString(String string) {
        HashSet<Integer> result = new HashSet<Integer>();
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(string.split("[,|.| ]")));
        for (int i = 0; i < arrayList.size(); i++) {
            try {
                result.add(Integer.parseInt(arrayList.get(i)));
            } catch (Exception e) {
            }
        }
        return result;
    }
}
