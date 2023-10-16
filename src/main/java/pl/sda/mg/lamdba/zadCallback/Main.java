package pl.sda.mg.lamdba.zadCallback;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();

        service.process(32, 100, (x, y) -> (x + y + 7));
    }
}
