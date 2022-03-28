package lesson16.homework.lambda.car;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car audi = new Car("Audi A3", true, false, true,2012);
        Car bmw = new Car("BMW X3", true, true, false, 2010);
        List<Car> carList = new ArrayList<Car>();
        carList.add(audi);
        carList.add(bmw);
        System.out.println("Before sort:");
        for (Car car : carList) {
            System.out.println(car);
        }
        carList.sort((o1, o2) -> o1.getYearOfIssue() - o2.getYearOfIssue());
        System.out.println("After sort:");
        for (Car car : carList) {
            System.out.println(car);
        }
        verification(audi, (car) -> car.isDieselEngine());
        verification(bmw, (car) -> (car.isFullDrive() && car.isDieselEngine()));
    }

    private static void verification(Car car, CheckCar checkCar) {
        if (checkCar.check(car)) {
            System.out.println(car + " verification in system");
        } else {
            System.out.println(car + " verification error");
        }
    }
}
