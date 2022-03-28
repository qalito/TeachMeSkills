package lesson10;

public class StringСalculator {
    public final char sign = '=';

    public StringBuilder getOperatorOne(int numberOne, int numberTwo) {
        StringBuilder calcString = new StringBuilder();
       calcString.append(numberOne);
       calcString.append('+');
       calcString.append(numberTwo);
       calcString.append(sign);
       calcString.append(numberOne + numberTwo);
        return calcString;
    }

    public StringBuilder getOperatorTwo(int numberOne, int numberTwo) {
        StringBuilder calcString = new StringBuilder();
        calcString.append(numberOne);
        calcString.append('-');
        calcString.append(numberTwo);
        calcString.append(sign);
        calcString.append(numberOne - numberTwo);
        return calcString;
    }

    public StringBuilder getOperatorThree(int numberOne, int numberTwo) {
        StringBuilder calcString = new StringBuilder();
        calcString = calcString.append(numberOne);
        calcString = calcString.append('*');
        calcString = calcString.append(numberTwo);
        calcString = calcString.append(sign);
        calcString = calcString.append(numberOne * numberTwo);
        return calcString;
    }
}
