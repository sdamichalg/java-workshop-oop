package pl.sda.mg.collections.sets;

import java.util.Objects;

public class Car {
    private String brand;
    private String car;

    public Car(String brand, String car) {
        this.brand = brand;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", car='" + car + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car1 = (Car) o;
        return Objects.equals(brand, car1.brand) && Objects.equals(car, car1.car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, car);
    }
}
