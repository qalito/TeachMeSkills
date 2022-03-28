package lesson6.homework.transport;

public class AirTransport extends Transport {
    private double wingspan;
    private double landingLength;

    public AirTransport(double power, double maxSpeed, double weight, TransportMark mark, double wingspan, double landingLength) {
        super(power, maxSpeed, weight, mark);
        this.wingspan = wingspan;
        this.landingLength = landingLength;
    }

    @Override
    public String toString() {
        return "AirTransport "+super.toString() +
                ", wingspan=" + wingspan +
                ", landingLength=" + landingLength;
    }
}
