package lesson5.homework.computer;

public class Ram {
    private String ramName;

    public Ram(String cpuName) {
        this.ramName = cpuName;
    }

    public void getRamName() {
        System.out.println("RAM name is "+ramName);
    }
}
