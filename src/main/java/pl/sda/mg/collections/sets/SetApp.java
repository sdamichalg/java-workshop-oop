package pl.sda.mg.collections.sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();

        myList.add("jeden");
        myList.add("dwa");
        myList.add("trzy");
        myList.add("jeden");

        System.out.println(myList.size());

        Set<String> mySet = new HashSet<>(myList);
        System.out.println(mySet.size());
    }
}
