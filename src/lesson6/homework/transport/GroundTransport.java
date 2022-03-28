package lesson6.homework.transport;

public class GroundTransport extends Transport {
    private int countWheels;
    private double fuelConsumption;

    public GroundTransport(double power, double maxSpeed, double weight, TransportMark mark, int countWheels, double fuelConsumption) {
        super(power, maxSpeed, weight, mark);
        this.countWheels = countWheels;
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public String toString() {
        return "GroundTransport "+super.toString() +
                ", countWheels=" + countWheels +
                ", fuelConsumption=" + fuelConsumption;
    }
}
