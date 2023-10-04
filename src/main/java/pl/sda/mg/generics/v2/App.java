package pl.sda.mg.generics.v2;

public class App {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Cofee cofee = new Cofee();
        Cake cake = new Cake();

        Drink cocktail = new Drink() {
            @Override
            void startDrink() {
                System.out.println("Drinking delicious cocktail!");
            }
        };

        Cup<Tea> teaCup = new Cup<>(tea);
        Cup<Cofee> cofeeCup = new Cup<>(cofee);
        Cup<Drink> cocktailCup = new Cup<>(cocktail);
//        Cup<Cake> cakeCup = new Cup<Cake>(cake); // blad kompilacji

        teaCup.drink();
        cofeeCup.drink();
        cocktailCup.drink();
    }
}
