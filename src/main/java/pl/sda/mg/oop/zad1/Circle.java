package pl.sda.mg.oop.zad1;

public class Circle { //rozwiazanie Aksel
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return Math.PI * radius * 2;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Pole koła: " + String.format("%.3f",circle.getArea()));
        System.out.println("Obwód koła: " + String.format("%.3f",circle.getPerimeter()));
    }
}
