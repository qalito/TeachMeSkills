package lesson11.homework.serializable;


import java.io.Serializable;

public class Car implements Serializable {
    private int speed;
    private double price;
    private String brand;
    private final transient int countWheel = 4;

    public Car(int speed, double price, String brand) {
        this.speed = speed;
        this.price = price;
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCountWheel() {
        return countWheel;
    }

    public void checkSpeed(int speed) {
        if (speed <= 0) {
            System.out.println("Incorrect speed value!");
            return;
        }
        if (this.speed < speed) {
            System.out.println("Speed > limits!");
        } else {
            System.out.println("Max car speed " + speed);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed='" + speed + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                '}';
    }
}