package DSA.Sorting.Insertion_Sort;

public class Insertion_Sort_in_Array_of_Strings {

    public static void insertionSort(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            String key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        String[] arr = {"banana", "apple", "cherry", "date"};
        insertionSort(arr);
        for (String str : arr) {
            System.out.print(str + " ");
        }
    }
}
