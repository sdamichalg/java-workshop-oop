package pl.sda.mg.collections.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App2 {
    public static void main(String[] args) {
        List<String> listaStringow = new ArrayList<>();

        listaStringow.add("Jan");
        listaStringow.add("Paweł");
        listaStringow.add("Karol");
        listaStringow.add("Tomasz");
        listaStringow.add("Karolina");
        listaStringow.add("Anna");

        System.out.println(listaStringow.get(0));
        System.out.println(listaStringow);
        System.out.println(listaStringow.remove("Karol"));
        System.out.println(listaStringow);
        System.out.println(listaStringow);

        int[] ints = new int[] {1, 2 , 3, 4};
        Integer[] inty = new Integer[]{1, 2 , 3, 4};

        List<Integer> listaIntegerow = Arrays.asList(inty);
    }
}
