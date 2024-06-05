package DSA.Sorting.Selection_Sort;

public class Selection_Sort_Ascending {
    public static void main(String[] args) {

        // Example array
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        // Display the original array
        System.out.println("Original array:");
        displayArray(numbers);

        // Perform selection sort
        selectionSort(numbers);

        // Display the sorted array
        System.out.println("Sorted array:");
        displayArray(numbers);
    }

    // Method to perform selection sort
    public static void selectionSort(int[] array) {
        int n = array.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    // Method to display the elements of an array
    public static void displayArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
