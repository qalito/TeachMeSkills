package lesson16.task.localdate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Car {
    private LocalDate createDate;
    private int expirationYears;

    public Car(LocalDate createDate, int expirationYears) {
        this.createDate = createDate;
        this.expirationYears = expirationYears;
    }

    public Car() {
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public int getExpirationYears() {
        return expirationYears;
    }

    public void setExpirationYears(int expirationYears) {
        this.expirationYears = expirationYears;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.YYYY");
        return "Car create " + formatter.format(createDate) + ", expiration " + expirationYears + " years";
    }
}
