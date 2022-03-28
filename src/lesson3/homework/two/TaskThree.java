package lesson3.homework.two;

public class TaskThree {
    public static void main(String[] args) {
        /*Вычислить: 1+2+4+8+…+256*/
        System.out.println("Способ 1");
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += (int) Math.pow(2, i);
        }
        System.out.println("sum = " + sum);
        System.out.println("Способ 2");
        sum = 0;
        for (int i = 1; i < 257; i *= 2) {
            sum = sum + i;
        }
        System.out.println("sum = " + sum);
    }
}