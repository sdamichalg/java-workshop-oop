package pl.sda.mg.generics.zadSwap;

public class Swap {
    public static <T> T[] swapElements(T[] array, int position1, int position2) {
        if (position1 < 0 ||  position2 < 0 || position1 >= array.length || position2 >= array.length) {
            throw new IllegalArgumentException("Invalid positions provided");
        }

        T temp = array[position1];
        array[position1] = array[position2];
        array[position2] = temp;

        return array;
    }

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("Tablica pierwotna: ");
        printArray(intArray);

        Integer[] swappedElements = swapElements(intArray, 4, 8);

        System.out.print("Tablica po zmianie: ");
        printArray(swappedElements);
    }
}
