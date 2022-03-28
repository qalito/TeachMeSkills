package lesson6.homework.robot.heads;

public class SonyHead implements IHead {
    private int price;

    public SonyHead(int price) {
        this.price = price;
    }


    @Override
    public void speek() {
        System.out.println("Sony speek lalalalala.....");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
