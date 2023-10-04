package pl.sda.mg.generics.wildcard;

public class Tea implements Drink{

    @Override
    public String toString() {
        return "Tea{}";
    }

    @Override
    public void startDrink() {
        System.out.println("It's tea time!");
    }
}
