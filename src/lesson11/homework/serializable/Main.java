package lesson11.homework.serializable;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./src/lesson11/homeWork/serializable/Car.txt"))) {
            Car car = new Car(78, 33, "BMW");
            oos.writeObject(car);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./src/lesson11/homeWork/serializable/Car.txt")))
        {
            Car car=(Car)ois.readObject();
            System.out.println("Car brand:"+car.getBrand()+"  price: "+car.getPrice()+"speed:"+car.getSpeed());
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
