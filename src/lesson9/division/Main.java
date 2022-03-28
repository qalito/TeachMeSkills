package lesson9.division;

public class Main {
    public static void main(String[] args) {
        Number numberOne = new Number();
        Number numberTwo = new Number();
        System.out.println("First number:");
        numberOne.scanNumber();
        System.out.println("Last number:");
        numberTwo.scanNumber();
        Division division = new Division(numberOne.getNum(), numberTwo.getNum());
        division.getDivisionResult();
    }
}
