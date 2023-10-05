package pl.sda.mg.collections.maps;

import pl.sda.mg.collections.sets.Car;

import java.util.HashMap;
import java.util.Map;

public class MapApp {
    public static void main(String[] args) {
        Map<String, Integer> employees = new HashMap<>();
        employees.put("Jan Kowalski", 10_000);
        employees.put("Adam Kowalski", 13_000);
        employees.put("Adam Mickiewicz", 10_000);
        employees.put("Jan Krawczyk", 50_000);

        employees.put("Jan Krawczyk", 50_000);

        Integer salaryKowalski = employees.get("Jan Kowalski") + 1_000;

        employees.put("Jan Kowalski", salaryKowalski);

        System.out.println(employees);
        System.out.println("Rozmiar mapy:" + employees.size());


        Map<Car, Integer> cars = new HashMap<>();
        Car car1 = new Car("Opel", "Astra");
        Car car2 = new Car("Kia", "Ceed");
        Car car3 = new Car("BMW", "X6");
        Car car4 = new Car("BMW", "X6");

        cars.put(car1, 50_000);
        cars.put(car2, 51_000);
        cars.put(car3, 52_000); //zostal usuniety
        cars.put(car4, 50_000); //ten zostal dodany

        System.out.println(cars.get(car1));

        System.out.println(cars);
        System.out.println("Rozmiar mapy:" + cars.size());

        System.out.println("***************");
        System.out.println("Klucze z mapy:");
        for (String s: employees.keySet()) {
            System.out.println(s);
        }

        System.out.println("***************");
        System.out.println("Wartości:");
        for (Integer i: employees.values()) {
            System.out.println(i);
        }

        System.out.println("***************");
        System.out.println("Klucz wartość:");
        for (Map.Entry<String, Integer> pairKV : employees.entrySet()) {
            System.out.println(pairKV);
            System.out.println(pairKV.getKey());
            System.out.println(pairKV.getValue());
        }
    }
}
