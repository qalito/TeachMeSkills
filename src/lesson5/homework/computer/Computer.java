package lesson5.homework.computer;

import java.util.Random;

public class Computer {
    private Cpu cpu;
    private Ram ram;
    private Hdd hdd;
    private int inclusionResource;
    private boolean onComputer;

    public Computer(Cpu cpu, Ram ram, Hdd hdd, int inclusionResource) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.inclusionResource = inclusionResource;
        this.onComputer = false;
    }

    public void infoAboutComputer() {
        System.out.println("About computer:");
        cpu.getCpuName();
        ram.getRamName();
        hdd.getHddName();
        System.out.println("inclusionResource is " + inclusionResource);
        System.out.println("Computer is " + (onComputer ? "on" : "off"));
    }

    public void turnOn(int userNumber) {
        if (inclusionResource > 0 && onComputer == false) {
            Random random = new Random();
            int number = random.nextInt(2);
            System.out.println("Number on =" + number + ", you number " + userNumber);
            if (userNumber == number) {
                System.out.println("Computer on");
            } else {
                inclusionResource = 0;
                turnOn(0);
            }
        } else if (onComputer == true && inclusionResource > 0) {
            System.out.println("info: Computer onn!");
        } else {
            System.out.println("Computer burned out");
        }
    }

    public void turnOff(int userNumber) {
        if (inclusionResource > 0 && onComputer == true) {
            Random random = new Random();
            int number = random.nextInt(2);
            if (userNumber == number) {
                System.out.println("Computer off");
                inclusionResource--;
            } else {
                inclusionResource = 0;
                turnOn(0);
            }
        } else if (onComputer == false && inclusionResource > 0) {
            System.out.println("info: Computer off!");
        } else {
            System.out.println("Computer burned out");
        }
    }


}
