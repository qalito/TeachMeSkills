package lesson16.task.localdate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(LocalDate.of(2022, 2, 10), 10);
        System.out.println(car);
        Scanner scanner = new Scanner(System.in);
        LocalDate checkDate = null;
        while (checkDate == null)
            try {
                System.out.println("Write check date yyyy-mm-dd:");
                checkDate = LocalDate.parse(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Write date Error");
            }
        LocalDate expirationDate = DateHandler.checkExpiration(car);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.YYYY");
        System.out.println(formatter.format(DateHandler.checkExpiration(car)));
        if (DateHandler.isAfterDate(checkDate, expirationDate)) {
            System.out.println("Your Car registration certificate expired");
        } else {
            System.out.println("Your Car registration certificate  in order");
        }
    }
}
