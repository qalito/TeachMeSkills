package lesson6.homework.transport;

public class Main {
    public static void main(String[] args) {
        Transport transport = new Transport(123.5, 256, 1256, TransportMark.BMW);
        System.out.println(transport);
        GroundTransport ground = new GroundTransport(133.5, 240, 1800, TransportMark.AUDI,4,10);
        System.out.println(ground);
        PassengerTransport car = new PassengerTransport(133.5, 240, 1800, TransportMark.FERRARI,4,10, CarBody.HATCHBACK, 4);
        System.out.println(car);
        car.getInfoConsumption(4);
        FreightTransport freight = new FreightTransport(133.5, 240, 1800, TransportMark.AUDI,4,10,1000);
        System.out.println(freight);
        freight.checkLoad(1200);
        AirTransport air = new AirTransport(133.5, 240, 1800, TransportMark.TOYOTA,4,10);
        System.out.println(air);
        MilitaryTransport military = new MilitaryTransport(133.5, 240, 1800, TransportMark.TOYOTA,4,10,true,5);
        System.out.println(military);
        military.checkCatapult();
        military.launchMissiles();
        СivilTransport civil = new СivilTransport(133.5, 240, 1800, TransportMark.TOYOTA,4,10,5,true);
        System.out.println(civil);
        civil.checkLoad(8);

    }
}
