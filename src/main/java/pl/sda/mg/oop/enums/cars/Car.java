package pl.sda.mg.oop.enums.cars;

public class Car {
    private FuelType fuelType;
    private Brand brand;
    private String model;
    private int price;

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "fuelType=" + fuelType +
                ", brand=" + brand +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
