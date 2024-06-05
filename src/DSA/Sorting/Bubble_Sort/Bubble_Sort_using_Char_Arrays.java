package DSA.Sorting.Bubble_Sort;

public class Bubble_Sort_using_Char_Arrays {

    public static void main(String[] args) {
        char[] array = {'d', 'a', 'c', 'b', 'e'};
        int n = array.length;

        System.out.println("Unsorted array:");
        for (char c : array) {
            System.out.print(c + " ");
        }
        System.out.println();

        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    char temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }

        System.out.println("Sorted array:");
        for (char c : array) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
