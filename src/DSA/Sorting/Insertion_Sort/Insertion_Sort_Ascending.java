package DSA.Sorting.Insertion_Sort;

public class Insertion_Sort_Ascending {

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6}; // Sample array

        // Sort the array
        insertionSort(arr);

        // Print the sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }

    }

    // Function to sort an array using insertion sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        // Start from the second element (index 1)
        for (int i = 1; i < n; ++i) {
            int key = arr[i]; // Store the current element
            int j = i - 1; // Index of the previous element

            // Move elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            // Place the current element (key) in its correct position
            arr[j + 1] = key;
        }
    }
}
