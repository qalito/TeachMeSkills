package lesson12.thread.one;

public class Main {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        t.setName("Tonya");
        System.out.println(t.getName());
        Thread myThread = new MyThread();
        myThread.setDaemon(true);
        myThread.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("!!!!!!!");
    }
}
