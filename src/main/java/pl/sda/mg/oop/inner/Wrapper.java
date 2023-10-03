package pl.sda.mg.oop.inner;

public class Wrapper { //klasa lokalna wewnętrzna
    public String printMyData() {
        class MyInnerClaz {
            String firstName = "Michal";
            String lastName = "G.";

            private String printFromInnerClaz() {
                return firstName + " " + lastName;
            }
        }
        MyInnerClaz myInnerClaz = new MyInnerClaz();
        return myInnerClaz.printFromInnerClaz();
    }
}
