package pl.sda.mg.oop.enums.cofee;

public class Example {
    public static void main(String[] args) {
        Cofee[] cofees = Cofee.values();

        for (Cofee cofee : cofees) {
            System.out.println("Kawa: " + cofee);
            System.out.println("Rodzaj mleka: " + cofee.getMilk().getPlName());
            System.out.println("Cena: " + cofee.getPrice());
            System.out.println("***********************");
        }

    }
}
