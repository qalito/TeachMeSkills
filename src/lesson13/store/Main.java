package lesson13.store;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        Consumer consumer = new Consumer();
        Producer producer = new Producer();
        consumer.setStore(store);
        producer.setStore(store);
        new Thread(consumer).start();
        new Thread(producer).start();
    }
}
