package lesson13.store;

public class Store {
    private int product = 0;

    public int getProduct() {
        return product;
    }

    public void setProduct(int product) {
        this.product = product;
    }

    public synchronized void get() {
        while (product <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        product--;
        System.out.println("One product sold in store!");
        System.out.println("Product in store:" + getProduct());
        notify();
    }

    public synchronized void put() {
        while (product >= 3) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        product++;
        System.out.println("One product added to store!");
        System.out.println("Product in store:" + getProduct());
        notify();
    }
}
