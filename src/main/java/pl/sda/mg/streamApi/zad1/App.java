package pl.sda.mg.streamApi.zad1;

public class App {
    public static void main(String[] args) {
        FootballRepository repository = new FootballDatabase();

        System.out.println(repository.findAll());
        System.out.println("******************");
        System.out.println(repository.findFootballersByClub("FC Barcelona"));

    }
}
