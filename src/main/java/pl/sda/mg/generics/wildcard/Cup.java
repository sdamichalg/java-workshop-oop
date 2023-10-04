package pl.sda.mg.generics.wildcard;

public class Cup<T extends Food> {
    @Override
    public String toString() {
        return "Cup{" +
                "food=" + food +
                '}';
    }

    private final T food;

    public Cup(T food) {
        this.food = food;
    }

    public T getFood() {
        return food;
    }
}
