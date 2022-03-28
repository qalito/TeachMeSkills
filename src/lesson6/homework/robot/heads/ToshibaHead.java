package lesson6.homework.robot.heads;

public class ToshibaHead implements IHead {
    private int price;

    public ToshibaHead(int price) {
        this.price = price;
    }

    @Override
    public void speek() {
        System.out.println("Toshiba speek lalalalala.....");
    }

    @Override
    public int getPrice() {
        return price;
    }
}