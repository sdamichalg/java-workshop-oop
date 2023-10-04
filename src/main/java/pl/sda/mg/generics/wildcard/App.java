package pl.sda.mg.generics.wildcard;

public class App {
    public static void main(String[] args) {
        Cake cake = new Cake();
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        Cup<Coffee> coffeeCup = new Cup<>(coffee);
        Cup<Tea> teaCup = new Cup<>(tea);
        Cup<Cake> cakeCup = new Cup<>(cake);

        printNames(coffeeCup);
        printNames(teaCup);
//        printNames(cakeCup);

    }

    private static void printNames(Cup<? extends Drink> food) {
        System.out.println(food);
    }

}
