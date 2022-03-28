package lesson12.thread.one;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread start");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("MyThread finishd");
    }
}
