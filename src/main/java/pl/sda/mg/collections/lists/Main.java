package pl.sda.mg.collections.lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> mojaLista = new ArrayList<>(); //lepsza do przeszukiwania i wyciagania elemntow z kolekcji
        List<Integer> mojaLista2 = new LinkedList<>(); //lepsza do czestszego usuwania i dodawania elementów
        mojaLista.add(2);
        mojaLista.add(1);

        printPlusValue(mojaLista, 2);
    }

    private static void printPlusValue(List<Integer> lista, int value) {
        for (Integer i : lista) {
            System.out.println(i + value);
        }
    }
}
