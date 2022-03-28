package lesson6.homework.transport;

public class Transport {
    private double power;
    private double maxSpeed;
    private double weight;
    private TransportMark mark;

    public Transport(double power, double maxSpeed, double weight, TransportMark mark) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.mark = mark;
    }

    public TransportMark getMark() {
        return mark;
    }

    public double getPowerKb() {
        return power * 0.74;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "about: \n" +
                "power=" + power +
                "power kb=" + getPowerKb() +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", mark=" + mark;
    }
}
