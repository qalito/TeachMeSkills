package lesson2;

public class TaskOne {

    public static void main(String[] args) {
        // Было 5 яблок и 9, сколько у них обоих яблок, вывести, у кого было больше и на сколько и вывести на экран общее кол-во яблок у них чт/нчт.
        int countApple1, countApple2, sum;
        countApple1 = 5;
        countApple2 = 9;
        System.out.println("У Васи " + countApple1);
        System.out.println("У Пети " + countApple2);
        if (countApple1 > countApple2) {
            System.out.println("У Васи больше на" + (countApple1 - countApple2));
        } else if (countApple1 < countApple2) {
            System.out.println("У Пети больше на " + (countApple2 - countApple1));
        } else {
            System.out.println("У Васи и Пети равно");
        }
        sum = countApple1 + countApple2;
        System.out.println("У Васи и Пети в сумме " + sum);
        if (sum % 2 == 0) {
            System.out.println("У Васи и Пети четное кол-во " + sum);
        } else {
            System.out.println("У Васи и Пети нечетное кол-во " + sum);
        }

    }
}
