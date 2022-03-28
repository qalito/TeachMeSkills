package lesson9.division;

import java.util.Scanner;


public class Number {
    private int num;

    public int getNum() {
        return num;
    }

    public int scanNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write please number:");
        try {
            num = scanner.nextInt();
            checkNumber();
        } catch (Exception e) {
            System.out.println("Input error.....");
            scanNumber();
        }
        return num;
    }

    public void checkNumber() {
        if (num < 0 || num > 10) {
            System.out.println("Number no in [1;10]...");
            scanNumber();
        }
    }
}
