package DSA.Sorting.Selection_Sort;

public class Selection_Sort_in_Double_Arrays {

    public static void main(String[] args) {
        double[] array = {3.14, 2.71, 1.618, 1.414, 0.577};

        System.out.println("Original array:");
        printArray(array);

        selectionSort(array);

        System.out.println("Sorted array:");
        printArray(array);
    }

    public static void selectionSort(double[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            double temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void printArray(double[] array) {
        for (double num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
