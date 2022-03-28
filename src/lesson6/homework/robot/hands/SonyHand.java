package lesson6.homework.robot.hands;

public class SonyHand implements IHand {
    private boolean handUp;
    private int price;

    public SonyHand(boolean handUp, int price) {
        this.handUp = handUp;
        this.price = price;
    }

    @Override
    public void upHand() {
        if (!handUp) {
            System.out.println("Sony Hand is UP!");
        } else {
            System.out.println("Sony Hand is already UP!");
        }
    }

    @Override
    public int getPrice() {
        return price;
    }
}
