package pl.sda.mg.oop.enums.cofee;

public enum Cofee {

    LATTE(Milk.NATURAL, 15),
    CAPPUCCINO(Milk.OAT, 15),
    AMERICANO(Milk.SOY, 17),
    ESPRESSO(Milk.NONE, 10);
    private Milk milk;
    private int price;

    public Milk getMilk() {
        return milk;
    }

    public int getPrice() {
        return price;
    }

    Cofee(Milk milk, int price) {
        this.milk = milk;
        this.price = price;
    }
}
