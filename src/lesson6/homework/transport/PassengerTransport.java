package lesson6.homework.transport;

public class PassengerTransport extends GroundTransport {
    private CarBody body;
    private int countPassenger;

    public PassengerTransport(double power, double maxSpeed, double weight, TransportMark mark, int countWheels, double fuelConsumption, CarBody body, int countPassenger) {
        super(power, maxSpeed, weight, mark, countWheels, fuelConsumption);
        this.body = body;
        this.countPassenger = countPassenger;
    }

    private double getConsumption(double time) {
        return (getDistance(time) / 100.0) * getFuelConsumption();
    }

    private double getDistance(double time) {
        return time * getMaxSpeed();
    }

    public void getInfoConsumption(double time) {
        System.out.println("For time " + time + " h, PassengerTransport with mark " + getMark()
                + " with max speed " + getMaxSpeed() + " km/h"
                + ", drive " + getDistance(time) + " km and use " + getConsumption(time) + " l fuel.");
    }

    @Override
    public String toString() {
        return "PassengerTransport "+super.toString() +
                ", body=" + body +
                ", countPassenger=" + countPassenger;
    }
}
