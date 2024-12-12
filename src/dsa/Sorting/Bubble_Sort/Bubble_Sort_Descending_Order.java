package dsa.Sorting.Bubble_Sort;

public class Bubble_Sort_Descending_Order {
    public static void main(String[] args) {

        int[] arr = {9, 3, 2, 6, 4, 7, 8, 1, 23, 5, 23, 65, 97, 123};
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {

                if (arr[j] <= arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        System.out.println("After sorting :");
        for (int a : arr) {
            System.out.println(a);
        }
    }
}
