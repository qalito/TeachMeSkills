package lesson5.homework.computer;

public class Cpu {
    private String cpuName;

    public Cpu(String cpuName) {
        this.cpuName = cpuName;
    }

    public void getCpuName() {
        System.out.println("CPU name is "+cpuName);
    }
}
