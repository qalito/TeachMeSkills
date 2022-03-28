package lesson3.homework.one;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        /*3) Дано целое число. Если оно является положительным, то прибавить к нему 1.
        Если отрицательным, то вычесть из него 2. Если нулевым, то заменить его на
        10. Вывести полученное число.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int number= scanner.nextInt();
        if (number > 0){
            number++;
        } else if (number<0){
            number-=2;
        } else {
            number=10;
        }
        System.out.println("number = "+number);
    }
}
