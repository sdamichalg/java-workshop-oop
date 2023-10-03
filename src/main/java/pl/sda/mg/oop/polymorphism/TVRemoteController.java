package pl.sda.mg.oop.polymorphism;

public class TVRemoteController implements RemoteController{

    private boolean enable;
    @Override
    public void enable(boolean enable) {
        this.enable = enable;
        System.out.println("Is TV working? - " + this.enable);
    }
}
