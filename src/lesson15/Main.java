package lesson15;

import lesson14.homework.store.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    /*3. Набор чисел
    Пользователь вводит набор чисел в виде одной строки "1, 2, 3, 4, 4, 5".
    Избавиться от повторяющихся элементов в строке.
    Вывести результат на экран.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your string:");
        String string = scanner.nextLine();
        System.out.println(StringUtil.splitString(string));
        }
    }
