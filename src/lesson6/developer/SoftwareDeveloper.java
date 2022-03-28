package lesson6.developer;

public class SoftwareDeveloper extends Worker {
    private String developmentType;

    public SoftwareDeveloper(String name, int age, int experienceYears, String developmentType) {
        super(name, age, experienceYears);
        this.developmentType = developmentType;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSoftwareDeveloper{" +"developmentType='" + developmentType + '\'' + '}';
    }
}
