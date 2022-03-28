package lesson9.homework.two;

import java.io.IOException;
import java.util.Scanner;

public class StringEditor {
    private Scanner scanner = new Scanner(System.in);

    public String inputStringValidated() {
        System.out.println("Input string with length > 2");
        String string = scanner.next();
        try {
            if (string.length() < 3) {
                throw new IOException();
            }
        } catch (IOException e) {
            System.out.println("Error string with length > 2");
            string = inputStringValidated();
        }
        return string;
    }

    public String replaceAll(String string) {
        return string.replaceAll(String.valueOf(string.charAt(2)),
                String.valueOf(string.charAt(0)));
    }
}
