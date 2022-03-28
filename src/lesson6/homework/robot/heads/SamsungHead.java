package lesson6.homework.robot.heads;

public class SamsungHead implements IHead {
    int price;

    public SamsungHead(int price) {
        this.price = price;
    }

    @Override
    public void speek() {
        System.out.println("Samsung speek lalalalala.....");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
