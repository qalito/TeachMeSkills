package lesson12.runnable;


public class Main {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println(t.getName());
        t.setName("Tonya");
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        MyRunnable myRunnableTwo = new MyRunnable();
        Thread threadTwo = new Thread(myRunnableTwo);
        threadTwo.setDaemon(true);
        threadTwo.start();
        System.out.println("!!!!!!!");
    }
}
