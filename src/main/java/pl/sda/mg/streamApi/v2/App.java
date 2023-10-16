package pl.sda.mg.streamApi.v2;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Car> cars = getCars();
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
