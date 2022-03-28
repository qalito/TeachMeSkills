package lesson13.homework.person;

public class Person {
    private String fullName;
    private int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {
        fullName = "none";
        age = 0;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void move(String move) {
        System.out.println(this + " move... " + move);
    }

    public void talk(String talk) {
        System.out.println(this + " is talk... " + talk);
    }

    @Override
    public String toString() {
        return "Person " + "full name:" + getFullName() + " age:" + getAge();
    }
}
