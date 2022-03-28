package lesson6.developer;

public class Demo {
    public static void main(String[] args) {
        SoftwareDeveloper softwareDeveloper = new SoftwareDeveloper("Tonya", 2, 21, "developer");
        Worker worker = new Worker("Tonya", 21, 2);
        worker.getExperienceYears();

        System.out.println(softwareDeveloper);
    }
}