package DSA.Sorting.Bubble_Sort;

public class Bubble_Sort_using_Floating_numbers {

    public static void main(String[] args) {
        double[] array = {64.5, 34.2, 25.6, 12.1, 22.4, 11.9, 90.7};
        int n = array.length;

        System.out.println("Unsorted array:");
        for (double j : array) {
            System.out.print(j + " ");
        }
        System.out.println();

        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }

        System.out.println("Sorted array:");
        for (double j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
