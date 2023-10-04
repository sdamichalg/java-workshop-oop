package pl.sda.mg.generics.v1;

public class App {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Cofee cofee = new Cofee();

        Cup<Tea> teaCup = new Cup<>(tea);
        Cup<Cofee> cofeeCup = new Cup<>(cofee);

        teaCup.drink();
        cofeeCup.drink();
    }
}
