package lesson8.computer;

public class MacOc extends Computer {

    public MacOc(String brand) {
        super.brand=brand;
    }

    @Override
    public void pushInfo() {
        System.out.println("Brand MacOc -"+ super.brand);
    }
}
