package lesson9.homework.one;

import java.io.IOException;
import java.util.Scanner;

public class CharReader {
    static char readChar(String string) {
        Scanner scanner = new Scanner(System.in);
        char readChar = '0';
        System.out.println("Write char:");
        try {
            readChar = scanner.nextLine().charAt(0);
            if (string.indexOf(String.valueOf(readChar)) == -1) {
                throw new IOException();
            }
        } catch (IOException e) {
            readChar(string);
        }
        return readChar;
    }
}
