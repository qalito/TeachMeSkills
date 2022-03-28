package lesson6.homework.robot.hands;

public class ToshibaHand implements IHand{
    private boolean handUp;
    private int price;

    public ToshibaHand(boolean handUp, int price) {
        this.handUp = handUp;
        this.price = price;
    }
    @Override
    public void upHand() {
        if (!handUp) {
            System.out.println("Toshiba Hand is UP!");
        } else {
            System.out.println("Toshiba Hand is already UP!");
        }
    }
    @Override
    public int getPrice() {
        return price;
    }
}
