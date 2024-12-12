package dsa.Sorting.Bubble_Sort;

public class Optimized_Bubble_Sort {
    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90, 2};
        int n = array.length;

        System.out.println("Unsorted array:");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }

        System.out.println("Sorted array:");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
