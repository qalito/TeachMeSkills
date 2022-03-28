package lesson6.homework.transport;

public class FreightTransport extends GroundTransport {
    private double loadCapacity;

    public FreightTransport(double power, double maxSpeed, double weight, TransportMark mark, int countWheels, double fuelConsumption, double loadCapacity) {
        super(power, maxSpeed, weight, mark, countWheels, fuelConsumption);
        this.loadCapacity = loadCapacity;
    }

    public void checkLoad(double load) {
        if (loadCapacity <= load) {
            System.out.println("Track loaded");
        } else {
            System.out.println("Sorry you need a bigger truck");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                ", loadCapacity=" + loadCapacity;
    }
}
