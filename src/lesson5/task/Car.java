package lesson5.task;

public class Car {
    private int number;
    private int country;

    Car(int number) {
        this.number = number;
    }
    Car(int number, int country) {
        this.number = number;
        this.country=country;
    }

    private int getNumber() {
        return number;
    }

    private void setNumber(int number) {
        this.number = number;
    }
    public void print(){
        getNumber();
    }

}
