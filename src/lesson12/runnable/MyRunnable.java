package lesson12.runnable;

public class MyRunnable implements Runnable {

    public void run() {
        System.out.println("MyThread is run! " + Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException " + Thread.currentThread().getName());
        }
        System.out.println("MyThread is finished! " + Thread.currentThread().getName());
    }
}
