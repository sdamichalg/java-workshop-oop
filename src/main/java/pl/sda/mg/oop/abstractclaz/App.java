package pl.sda.mg.oop.abstractclaz;

public class App {
    public static void main(String[] args) {

        Car car = new DieselCar("123", "diesel");
        Car electricCar = new ElectricCar("999", "electric");

        car.runEngine();

    }
}
