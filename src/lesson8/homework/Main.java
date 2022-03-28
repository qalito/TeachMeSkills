package lesson8.homework;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Car[] arrayCar = new Car[5];
        Random random=new Random();
        for (int i = 0; i < arrayCar.length; i++) {
            CarType randomCarType = CarType.values()[random.nextInt(CarType.values().length)];
            Car car = new Car(randomCarType,100+20*i,15674*i,i+1);
            arrayCar[i]=car;
            System.out.println(arrayCar[i]);
            try {
                arrayCar[i].startEngine();
            } catch (StartCarException e) {
                System.out.println(e);
            }
        }
    }
}
