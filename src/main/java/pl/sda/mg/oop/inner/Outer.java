package pl.sda.mg.oop.inner;

public class Outer {

    String val1 = "wartosc normalna";
    static String val2 = "wartosc statyczna";


    public static class NestedStatic {
        public NestedStatic() {
        }

        public String getStatusClaz() {
            return clazStatus + val2;
        }

        String clazStatus = "static inner claz";
    }

    public class Inner {
        public Inner() {
        }

        public String getStatusClaz() {
            return clazStatus;
        }

        String clazStatus = "inner claz";

    }

    public void localClazExample() {
        class LocalInner {
            public void innerMethod() {
                System.out.println("Hello from my inner local claz!");
            }
        }

        LocalInner localInner = new LocalInner();
        localInner.innerMethod();
    }
}
