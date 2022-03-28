package lesson13.homework.reader;

import java.util.ArrayList;

public class Reader {
    private String fullName;
    private int cardNumber;
    private String faculty;
    private String dateOfBirth;
    private String phone;

    public Reader(String fullName, int cardNumber, String faculty, String dateOfBirth, String phone) {
        this.fullName = fullName;
        this.cardNumber = cardNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
    }

    public Reader() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void takeBook() {
        System.out.println(fullName+" take book");
    }
    public void takeBook(int count) {
        System.out.println(fullName+" take "+count+" book");
    }
//    public void takeBook(ArrayList<Book> books) {
//        System.out.println(fullName+" take ");
//        for (String book : books) {
//            System.out.print(" book: ");
//        }
//    }
    public void takeBook(ArrayList<Book> books) {
        System.out.println(fullName+" take ");
        for (Book book : books) {
            System.out.print(" book: "+book);
        }
    }
    public void returnBook() {
        System.out.println(fullName+" return book");
    }
    public void returnBook(int count) {
        System.out.println(fullName+" return "+count+" book");
    }
//    public void returnBook(ArrayList<String> bookName) {
//        System.out.println(fullName+" return");
//        for (String book : bookName) {
//            System.out.print(" book: "+getFullName());
//        }
//    }
    public void returnBook(ArrayList<Book> books) {
        System.out.println(fullName+" return");
        for (Book book : books) {
            System.out.print(" book: "+book.getName());
        }
    }
}
