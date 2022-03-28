package lesson9.homework.one;

import java.util.Scanner;

public class StringEditor {
private String string;
private Scanner scanner= new Scanner(System.in);
    public StringEditor() {
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String modifyString(char startChar, char endChar){
        string = string.substring(string.indexOf(String.valueOf(startChar)), string.lastIndexOf(String.valueOf(endChar)));
        return string;
    }

}
