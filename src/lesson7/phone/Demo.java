package lesson7.phone;

public class Demo {
    public static void main(String[] args) {
        Phone phoneOne = new Phone(2222, "Vivo", 323);
        Phone phoneTwo = new Phone(2222, "Vivo");
        phoneOne.receiveCall("Tosya");
        phoneTwo.receiveCall("Tosya", 23423);
        phoneOne.sendMessage(new int[]{234324,23234232});
    }
}
