package pl.sda.mg.generics.wildcard;

public class Coffee implements Drink{
    @Override
    public String toString() {
        return "Coffee{}";
    }

    @Override
    public void startDrink() {
        System.out.println("Time for coffee!");
    }
}
