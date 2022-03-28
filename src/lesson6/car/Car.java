package lesson6.car;

public class Car {
    private Colors color;
    private int speedLimit;
    private int weight;
    private CarType brand;

    public Car(Colors color, int speed, int weight, CarType brand) {
        this.color = color;
        this.speedLimit = speed;
        this.weight = weight;
        this.brand = brand;
    }


    public void changeColor(Colors color) {
        this.color = color;
    }

    public void checkSpeed(int speed) {
        if (speed <= 0) {
            System.out.println("Incorrect speed value!");
            return;
        }
        if (this.speedLimit < speed) {
            System.out.println("Speed > limits!");
        } else {
            System.out.println("Max car speed " + speed);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", speedLimit=" + speedLimit +
                ", weight=" + weight +
                ", brand='" + brand + '\'' +
                '}';
    }
}