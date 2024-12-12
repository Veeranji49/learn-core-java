package dsa.Sorting.Bubble_Sort;

public class Bubble_Sort_in_Strings {

    public static void main(String[] args) {

        String[] array = {"Banana", "Apple", "Cherry", "Mango", "Blueberry"};
        int n = array.length;

        System.out.println("Unsorted array:");
        for (String s : array) {
            System.out.print(s + " ");
        }
        System.out.println();

        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }

        System.out.println("Sorted array:");
        for (String s : array) {
            System.out.print(s + " ");
        }
        System.out.println();

    }
}
