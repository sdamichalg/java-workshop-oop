package pl.sda.mg.oop.annonymous;

public abstract class Car {

    private final String vin;
    private final String fuel;

    public Car(String vin, String fuel) { //zwykly konstruktor
        this.vin = vin;
        this.fuel = fuel;
    }

    public String getVin() { //zwykla metoda
        return vin;
    }

    abstract void runEngine(); //metoda abstrakcyjna
}
