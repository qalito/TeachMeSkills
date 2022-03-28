package lesson6.homework.robot.hands;

public class SamsungHand implements IHand {
    private boolean handUp;
    private int price;

    public SamsungHand(boolean handUp, int price) {
        this.handUp = handUp;
        this.price = price;
    }

    @Override
    public void upHand() {
        if (!handUp) {
            System.out.println("Samsung Hand is UP!");
        } else {
            System.out.println("Samsung Hand is already UP!");
        }
    }

    @Override
    public int getPrice() {
        return price;
    }
}
