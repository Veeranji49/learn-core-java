package DSA.Sorting.Bubble_Sort;

public class Bubble_Sort_1 {

    public static void main(String[] args) {

        int[] arr = {9, 3, 2, 6, 4, 7, 8, 1, 23, 5, 23, 65, 97, 123};
        int n = arr.length ;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {

                if (arr[j] >= arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("After sorting :");
        for (int a : arr) {
            System.out.println(a);
        }
    }
}
