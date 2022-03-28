package lesson9.homework.one;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringEditor stringEditor = new StringEditor();
        char startChar, endChar;
        System.out.println("Write string:");
        stringEditor.setString(scanner.nextLine());
        System.out.println("startChar:");
        startChar=CharReader.readChar(stringEditor.getString());
        System.out.println("endChar:");
        endChar=CharReader.readChar(stringEditor.getString());
        System.out.println(stringEditor.modifyString(startChar,endChar));
    }
}
