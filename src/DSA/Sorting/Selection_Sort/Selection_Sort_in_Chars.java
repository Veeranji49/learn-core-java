package DSA.Sorting.Selection_Sort;

public class Selection_Sort_in_Chars {


    public static void main(String[] args) {
        char[] array = {'b', 'a', 'd', 'c', 'e'};

        System.out.println("Original array:");
        printArray(array);

        selectionSort(array);

        System.out.println("Sorted array:");
        printArray(array);
    }

    public static void selectionSort(char[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            char temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void printArray(char[] array) {
        for (char ch : array) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }
}
