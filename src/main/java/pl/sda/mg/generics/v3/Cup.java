package pl.sda.mg.generics.v3;

public class Cup {

    private final Drink liquid;

    public <T extends Drink> Cup(T liquid) {
        this.liquid = liquid;
    }

    void drink() {
        System.out.println("Drinking " + liquid.getName());
    }

}
