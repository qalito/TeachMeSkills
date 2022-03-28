package lesson16.homework.lambda;

import java.util.function.*;


import lesson16.homework.lambda.car.Car;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = x -> x > 0;
        BinaryOperator<Double> binaryOperator = (x, y) -> Double.valueOf(Math.round((x * y)));
        UnaryOperator<Double> unaryOperator = x -> x * x;
        Function<Integer, String> convert = x -> String.valueOf(x);
        Car audi = new Car("Audi A3", false, true, false,2010);
        Consumer<Car> consumer = car -> car.setFullDrive(true);
        Supplier<Car> supplier = () -> new Car("Audi A6", false, true, false, 2011);;
        System.out.println(isPositive.test(-8));
        System.out.println(binaryOperator.apply(11.236, 12.654));
        System.out.println(unaryOperator.apply(5.55));
        System.out.println(convert.apply(5));
        consumer.accept(supplier.get());
        System.out.println(audi + (audi.isFullDrive() ? " full" : " isn't full"));
        System.out.println(supplier.get());

    }
}
