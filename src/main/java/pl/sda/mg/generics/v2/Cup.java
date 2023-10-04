package pl.sda.mg.generics.v2;

public class Cup<T extends Drink> {
    private final T drink;

    public Cup(T drink) {
        this.drink = drink;
    }

    void drink() {
        drink.startDrink();
    }
}
