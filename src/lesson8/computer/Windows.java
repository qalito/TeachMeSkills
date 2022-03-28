package lesson8.computer;

public class Windows extends Computer{
    public Windows(String brand) {
        super.brand=brand;
    }
    @Override
    public void pushInfo() {
        System.out.println("Brand Windows -"+ super.brand);
    }
}
