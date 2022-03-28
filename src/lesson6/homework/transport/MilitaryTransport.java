package lesson6.homework.transport;

public class MilitaryTransport extends AirTransport {
    private boolean catapult;
    private int countMissiles;

    public MilitaryTransport(double power, double maxSpeed, double weight, TransportMark mark, double wingspan, double landingLength, boolean catapult, int countMissiles) {
        super(power, maxSpeed, weight, mark, wingspan, landingLength);
        this.catapult = catapult;
        this.countMissiles = countMissiles;
    }

    public void launchMissiles() {
        if (countMissiles > 0) {
            System.out.println("Launch Missiles");
            countMissiles--;
        } else {
            System.out.println("Sorry, there are no missiles in your plane");
        }
    }

    public void checkCatapult() {
        if (catapult) {
            System.out.println("Catapult!");
            catapult = false;
        } else {
            System.out.println("You haven't Catapult!");
        }
    }

    @Override
    public String toString() {
        return "MilitaryTransport"+super.toString() +
                ", catapult=" + catapult +
                ", countMissiles=" + countMissiles;
    }
}
