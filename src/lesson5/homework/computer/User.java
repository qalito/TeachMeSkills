package lesson5.homework.computer;

import java.util.Random;

public class User {
    public static void main(String[] args) {
        System.out.println("Crete Computer:");
        Cpu cpu = new Cpu("Intel Core i5-8600K");
        Ram ram = new Ram("16 GB RAM");
        Hdd hdd = new Hdd("HDD 1TB");
        Random random = new Random();
        Computer computer = new Computer(cpu, ram, hdd, 3);
        for (int i = 0; i < 5; i++) {
            computer.infoAboutComputer();
            computer.turnOn(random.nextInt(2));
            computer.turnOff(random.nextInt(2));
            computer.infoAboutComputer();
        }
    }
}
