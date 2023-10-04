package pl.sda.mg.generics.v3;

public class App {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Cofee cofee = new Cofee();
        Car car = new Car();

        Cup teaCup = new Cup(tea);
        Cup cofeeCup = new Cup(cofee);
//        Cup carCup = new Cup(car); //blad kompilacji

        Cup[] cups = new Cup[]{teaCup, cofeeCup};

        for (Cup cup : cups) {
            cup.drink();
        }
    }
}
