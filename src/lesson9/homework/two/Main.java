package lesson9.homework.two;

public class Main {
    public static void main(String[] args) {
        StringEditor stringUtil = new StringEditor();
        String actual = stringUtil.inputStringValidated();
        System.out.println(stringUtil.replaceAll(actual));
    }
}
