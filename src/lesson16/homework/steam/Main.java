package lesson16.homework.steam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import lesson16.homework.lambda.car.Car;

public class Main {
    public static void main(String[] args) {
        long count = IntStream.of(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5).filter(w -> w > 0).count();
        List<String> cities = new ArrayList<String>();
        Collections.addAll(cities, "Paris", "London", "Madrid", "Los Angeles", "Kabul");
        List<Car> cars = new ArrayList<Car>();
        Collections.addAll(cars, new Car("Audi A6", false, true, false, 2011), new Car("BMW X6", true, false, true, 2020));
        cities.stream() // получаем поток
                .filter(s -> s.length() > 5)// применяем фильтрацию по длине строки
                .skip(1) // пропустить первый
                .limit(3) //первые три
                .forEach(s -> System.out.println(s)); // выводим отфильтрованные строки на
        cars.stream()
                .map(p -> p.toString()) //преобразуем поток объектов car
                .forEach(s -> System.out.println(s));
        System.out.println(cars.stream()
                .mapToInt(s -> s.getYearOfIssue())
                .allMatch(s -> s > 2012));

    }
}
