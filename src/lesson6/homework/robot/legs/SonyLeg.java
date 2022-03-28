package lesson6.homework.robot.legs;

public class SonyLeg implements ILeg {
    private int price;

    public SonyLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Sony leg step!");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
