package lesson16.homework.lambda.car;

public class Car {
    private String name;
    private boolean isFullDrive;
    private boolean isGasEngine;
    private boolean isDieselEngine;
    private int yearOfIssue;

    public Car(String name, boolean isFullDrive, boolean isGasEngine, boolean isDieselEngine, int yearOfIssue) {
        this.name = name;
        this.isFullDrive = isFullDrive;
        this.isGasEngine = isGasEngine;
        this.isDieselEngine = isDieselEngine;
        this.yearOfIssue = yearOfIssue;
    }

    public boolean isFullDrive() {
        return isFullDrive;
    }

    public void setFullDrive(boolean fullDrive) {
        isFullDrive = fullDrive;
    }

    public boolean isGasEngine() {
        return isGasEngine;
    }

    public boolean isDieselEngine() {
        return isDieselEngine;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    @Override
    public String toString() {
        return name;
    }
}
