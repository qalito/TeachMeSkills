package lesson6.car;

import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        Car car1 = new Car(Colors.RED, 140, 1500, CarType.AUDI);
        car1.changeColor(Colors.BLACK);
        car1.checkSpeed(50);
        System.out.println(car1);
        Car[] cars = new Car[4];
        Random random = new Random();
        for (int i = 0; i < cars.length; i++) {
            Colors randomColor = Colors.values()[random.nextInt(Colors.values().length)];
            CarType randomCarType = CarType.values()[random.nextInt(CarType.values().length)];
            cars[i] = new Car(randomColor, random.nextInt(200) + i * 23, random.nextInt(1000) + i * 150, randomCarType);
        }
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
