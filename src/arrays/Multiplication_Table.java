package arrays;

public class Multiplication_Table {
    public static void main(String[] args) {
        int[] arr = {9, 1, 4, 2, 5, 2, 7, 5, 8, 6, 3, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i <= arr.length - 1; i++) {
            int n = arr[i];
            for (int x = 1; x <= n; x++) {
                System.out.println(n + "X" + x + "=" + (x * n));
            }
        }
    }
}
