package pl.sda.mg.oop.inner;

public class App {
    public static void main(String[] args) {

        Outer outerClaz = new Outer();
        Outer.Inner inner = outerClaz.new Inner(); //klasa wewnetrzna

        System.out.println(inner.getStatusClaz());

        Outer.NestedStatic staticNested = new Outer.NestedStatic(); //klasa wewnętrzna statyczna

        System.out.println(staticNested.getStatusClaz());

        outerClaz.localClazExample();


        Wrapper wrapperClaz = new Wrapper();
        System.out.println(wrapperClaz.printMyData());
    }
}
