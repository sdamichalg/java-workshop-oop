package pl.sda.mg.oop.annonymous;

public class AppAnnonymous {
    public static void main(String[] args) {
        Car car = new Car("111", "fuel") {
            @Override
            void runEngine() {
                System.out.println("do testów");
            }
        };

        car.runEngine();
    }
}
