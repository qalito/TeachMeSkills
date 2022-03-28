package lesson6.homework.transport;

public class СivilTransport extends AirTransport {
    private int countPassenger;
    private boolean business;

    public СivilTransport(double power, double maxSpeed, double weight, TransportMark mark, double wingspan, double landingLength, int countPassenger, boolean business) {
        super(power, maxSpeed, weight, mark, wingspan, landingLength);
        this.countPassenger = countPassenger;
        this.business = business;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", countPassenger=" + countPassenger +
                ", business=" + business;
    }

    public void checkLoad(double count) {
        if (countPassenger <= count) {
            System.out.println("Air loaded");
        } else {
            System.out.println("Sorry you need a bigger air");
        }
    }
}
