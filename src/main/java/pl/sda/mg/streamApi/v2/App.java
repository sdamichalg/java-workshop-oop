package pl.sda.mg.streamApi.v2;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {

        List<Car> cars = getCars();

        System.out.println(cars.stream().count());
        cars.size();

        List<String> strings = cars.stream()
                .map(c -> c.getBrand())
//                .map(Car::getBrand)
                .collect(Collectors.toList());

        System.out.println(strings);

        OptionalDouble average = cars.stream()
                .map(c -> Integer.valueOf(c.getProductionYear()))
                .mapToInt(Integer::intValue)
                .average();

        average.ifPresent(avr -> System.out.println("Średni czas produkcji aut: " + avr));

    }

    private static List<Car> getCars() {
        Car car1 = Car.builder()
                .brand("Toyota")
                .model("Camry")
                .productionYear("2022")
                .fuelType(FuelType.HYBRID)
                .build();

        Car car2 = Car.builder()
                .brand("Tesla")
                .model("Model 3")
                .productionYear("2023")
                .fuelType(FuelType.ELECTRIC)
                .build();

        Car car3 = Car.builder()
                .brand("Volkswagen")
                .model("Golf")
                .productionYear("2020")
                .fuelType(FuelType.DIESEL)
                .build();

        Car car4 = Car.builder()
                .brand("Ford")
                .model("Focus")
                .productionYear("2021")
                .fuelType(FuelType.GASAOLINE)
                .build();

        return Arrays.asList(car1, car2, car3, car4);
    }
}
