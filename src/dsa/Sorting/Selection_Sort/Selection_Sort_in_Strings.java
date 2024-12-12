package dsa.Sorting.Selection_Sort;

public class Selection_Sort_in_Strings {

    public static void main(String[] args) {
        String[] array = {"banana", "apple", "orange", "grape", "kiwi"};

        System.out.println("Original array:");
        printArray(array);

        selectionSort(array);

        System.out.println("Sorted array:");
        printArray(array);
    }

    public static void selectionSort(String[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j].compareTo(array[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            String temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void printArray(String[] array) {
        for (String str : array) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
}
