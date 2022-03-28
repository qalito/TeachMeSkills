package lesson3.homework.two;

public class TaskOne {
    public static void main(String[] args) {
        /*1) Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый
        день он увеличивал дневную норму на 10% нормы предыдущего дня. Какой
        суммарный путь пробежит спортсмен за 7 дней */
        double norm = 10, sum = norm;
        for (int i = 2; i < 8; i++) {
            norm = norm + norm * 0.1;
            sum = sum + norm;
        }
        System.out.printf("Rez = %5.2f ", sum);
    }
}
