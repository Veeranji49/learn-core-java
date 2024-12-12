package arrays;

public class Replace_all_duplicates_with_0 {

    public static void main(String[] args) {

        //Replace all duplicates with 0

        int[] arr = {9, 1, 4, 2, 5, 2, 7, 5, 8, 6, 3, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = 0;
                }
            }
        }
        System.out.println("Final Array:");
        for (int x : arr) {
            System.out.println(x);
        }
    }
}
