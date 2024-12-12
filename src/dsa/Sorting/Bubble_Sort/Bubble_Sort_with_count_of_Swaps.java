package dsa.Sorting.Bubble_Sort;

public class Bubble_Sort_with_count_of_Swaps {

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        int n = array.length;
        int swapCount = 0;

        System.out.println("Unsorted array:");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();

        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                    swapCount++;
                }
            }
            if (!swapped) break;
        }

        System.out.println("Sorted array:");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();

        System.out.println("Total number of swaps: " + swapCount);
    }
}
