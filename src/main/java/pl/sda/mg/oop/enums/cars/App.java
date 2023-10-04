package pl.sda.mg.oop.enums.cars;

public class App {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setBrand(Brand.AUDI);
        car1.setModel("Q5");
        car1.setFuelType(FuelType.DIESEL);
        car1.setPrice(250_000);

        Car car2 = new Car();
        car2.setBrand(Brand.TESLA);
        car2.setModel("S");
        car2.setFuelType(FuelType.ELECTRIC);
        car2.setPrice(220_000);

        Car car3 = new Car();
        car3.setBrand(Brand.FIAT);
        car3.setModel("500L");
        car3.setFuelType(FuelType.GASOLINE);
        car3.setPrice(90_000);

        Car car4 = new Car();
        car4.setBrand(Brand.KIA);
        car4.setModel("Ceed");
        car4.setFuelType(FuelType.LPG);
        car4.setPrice(52_000);

        car4.toString()


        Car[] cars = new Car[4];

        cars[0] = car1;
        cars[1] = car2;
        cars[2] = car3;
        cars[3] = car4;

        for (Car car : cars) {
            System.out.println(car);
            System.out.println("=============");
        }

    }
}
