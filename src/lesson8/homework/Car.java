package lesson8.homework;

import java.util.Random;

public class Car {
    //Создать класс Car c полями (марка, скорость, цена), конструкторы (с
    //параметрами и default) гетеры-сетеры.
    private CarType mark;
    private double speed;
    private double price;
    private int id;

    public Car() {
        mark = CarType.BMW;
        speed = 170.5;
        price = 154678.25;
        id = 0;

    }

    public Car(CarType mark, double speed, double price, int id) {
        this.mark = mark;
        this.speed = speed;
        this.price = price;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Car N"+id+" mark:"+mark+" speed:"+speed+" price:"+price;
    }

    public void startEngine() throws StartCarException {
        byte start;
        Random random = new Random();
        start = (byte) random.nextInt(21);
        if (start % 2 == 0) {
            throw new StartCarException("Car N"+id+" mark:"+mark);
        } else {
            System.out.println("Car " + mark + " start work");
        }
    }
}

