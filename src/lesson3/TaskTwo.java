package lesson3;

import java.util.Scanner;

public class TaskTwo {
    //Ввод меяца или дня недели, проработка switch
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = 0, month = 0, dayOfWeek = 0;
        do {
            System.out.println("Введите число:");
            temp = scanner.nextInt();
            if (temp > 0 && temp < 8 && dayOfWeek == 0) {
                dayOfWeek = temp;
            } else if (temp > 0 && temp < 13 && month == 0) {
                month = temp;
            } else {
                System.out.println("Ошибка ввода, необходимо ввести месяц и день недели, исправьте значение веденного числа!");
            }
        } while (dayOfWeek == 0 || month == 0);
        switch (dayOfWeek) {
            case 1: {
                System.out.println("Понедельник");
                break;
            }
            case 2: {
                System.out.println("Вторник");
                break;
            }
            case 3: {
                System.out.println("Среда");
                break;
            }
            case 4: {
                System.out.println("Четверг");
                break;
            }
            case 5: {
                System.out.println("Пятница");
                break;
            }
            case 6: {
                System.out.println("Суббота");
                break;
            }
            case 7: {
                System.out.println("Воскресенье");
                break;
            }
            default: {
                System.out.println("Ошибка");
                break;
            }
        }
        switch (month) {
            case 1: {
                System.out.println("Январь");
                break;
            }
            case 2: {
                System.out.println("Февраль");
                break;
            }
            case 3: {
                System.out.println("Март");
                break;
            }
            case 4: {
                System.out.println("Апрель");
                break;
            }
            case 5: {
                System.out.println("Май");
                break;
            }
            case 6: {
                System.out.println("Июнь");
                break;
            }
            case 7: {
                System.out.println("Июль");
                break;
            }
            case 8: {
                System.out.println("Август");
                break;
            }
            case 9: {
                System.out.println("Сентябрь");
                break;
            }
            case 10: {
                System.out.println("Октябрь");
                break;
            }
            case 11: {
                System.out.println("Ноябрь");
                break;
            }
            case 12: {
                System.out.println("Декабрь");
                break;
            }
            default: {
                System.out.println("Ошибка");
                break;
            }
        }

    }
}
