package pl.sda.mg.collections.sets;

import java.util.HashSet;
import java.util.Set;

public class CarApp {
    public static void main(String[] args) {
        Car car1 = new Car("Opel", "Astra");
        Car car2 = new Car("Kia", "Ceed");
        Car car3 = new Car("BMW", "X6");
        Car car4 = new Car("BMW", "X6");

        String s1 = new String("Element1");
//        String s2 = new String("Element1");

        System.out.println(car3.equals(car4));
//        System.out.println(s1.equals(s2));


        Set<Car> cars = new HashSet<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

        System.out.println(cars);
        System.out.println("Liczba aut: " + cars.size());

    }
}
