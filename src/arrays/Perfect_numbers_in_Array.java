package arrays;

public class Perfect_numbers_in_Array {

    public static void main(String[] args) {

        //Print Perfect Numbers in Array

        int[] arr = {9, 1, 4, 2, 5, 2, 7, 5, 8, 6, 3, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i <= arr.length - 1; i++) {
            int n = arr[i];
            int sum = 0;
            for (int x = 1; x <= n - 1; x++) {
                if (n % x == 0) {
                    sum = sum + x;
                }
            }
            if (sum == n) {
                System.out.println("perfect Number:" + n);
            }
        }
    }
}
