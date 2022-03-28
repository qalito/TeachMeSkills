package lesson13.homework.person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFullName("Dimo Bill Milo");
        person.setAge(36);
        person.talk("Hello");
        Person personTwo = new Person("Steeve Madison Il", 36);
        personTwo.move("Raised his hands");
    }
}
