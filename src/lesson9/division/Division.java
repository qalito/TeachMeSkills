package lesson9.division;

public class Division {
    private double numberOne;
    private double numberTwo;

    public Division(double numberOne, double numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public void getDivisionResult() {
        double result;
        try {
            result = numberOne / numberTwo;
            System.out.println("Result division " + numberOne + " by " + numberTwo + " result =" + result);
        } catch (Exception e) {
            System.out.println("Error operation division by 0");
        }

    }
}
