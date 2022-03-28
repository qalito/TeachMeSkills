package lesson3.homework.two;

public class TaskTwo {
    public static void main(String[] args) {
        /*Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
        сколько амеб будет через 3, 6, 9, 12,..., 24 часа.*/
        System.out.println("Способ 1");
        int count = 1;
        for (int i = 3; i < 25; i = i + 3) {
            count = count * 2;
            System.out.println("Часов " + i + " , амеб " + count);
        }
        System.out.println("Способ 2");
        count = 3;
        while (count < 25) {
            System.out.println("Часов " + count + " , амеб " + (int) Math.pow(2, count / 3));
            count = count + 3;
        }
    }
}