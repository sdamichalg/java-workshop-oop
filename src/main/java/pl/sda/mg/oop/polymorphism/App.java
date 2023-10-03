package pl.sda.mg.oop.polymorphism;

public class App {

    public static void main(String[] args) {
        RemoteController tvController = new TVRemoteController();

        enableMyRemotes(tvController, true);

    }

    private static void enableMyRemotes(RemoteController controller, boolean bool) {
        controller.enable(bool);
    }
}
