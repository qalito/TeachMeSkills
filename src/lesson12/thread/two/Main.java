package lesson12.thread.two;

public class Main {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println(t.getName());
        t.setName("Tonya");
        Thread thread = new MyThread();
        thread.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("LaLala");
        Thread threadTwo = new MyThread();
        threadTwo.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread threadThree = new MyThread();
        threadThree.setDaemon(true);
        threadThree.start();
        System.out.println("finish" + t.getName());
    }
}

