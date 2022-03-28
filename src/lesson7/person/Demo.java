package lesson7.person;

public class Demo {
    public static void main(String[] args) {
        Person person = new Person();
        person.talk();
        person.move();
        Person person2 = new Person(12, "Pave");
        person2.move();
    }
}
