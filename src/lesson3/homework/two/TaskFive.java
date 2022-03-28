package lesson3.homework.two;

public class TaskFive {
    public static void main(String[] args) {
        /*Напишите программу печати таблицы перевода расстояний из дюймов в
        сантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см*/
        double[][] mas = new double[2][20];
        for (int i = 0; i < 20; i++) {
            mas[0][i] = i + 1;
            mas[1][i] = mas[0][i] * 2.56;
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.printf("%6.2f ", mas[i][j]);
            }
            System.out.println();
        }

    }
}