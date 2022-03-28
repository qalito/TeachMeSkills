package lesson6.developer;

public class Worker extends Person {
    private int experienceYears;


    public Worker(String name, int age, int experienceYears) {
        super(name, age);
        this.experienceYears = experienceYears;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    @Override
    public String toString() {
        return super.toString() + "\nWorker{" +"experienceYears='" + experienceYears + '\'' + '}';
    }
}
