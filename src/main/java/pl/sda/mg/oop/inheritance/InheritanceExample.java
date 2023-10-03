package pl.sda.mg.oop.inheritance;

public class InheritanceExample {
    public static void main(String[] args) {
        Animal cat = new Cat("Filemon", "miau", 2);
        Animal dog = new Dog("Azor", "hau", 3);

        checkAnimal(cat);
        checkAnimal(dog);
    }

    private static void checkAnimal(Animal animal) {
        animal.presentAnimal();
    }
}
