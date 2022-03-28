package lesson8.computer;

public class Main {
    public static void main(String[] args) {
       Computer computer = new MacOc("Mac OS");
       Computer computer1 = new Windows("Windows 7");
       computer.pushInfo();
       computer1.pushInfo();
    }
}
