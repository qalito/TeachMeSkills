package lesson12.thread.two;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread is run! " + getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException" + getName());
        }
        System.out.println("MyThread is finished! " + getName());
    }
}
