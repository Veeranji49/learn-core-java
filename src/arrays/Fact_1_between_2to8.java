package arrays;

public class Fact_1_between_2to8 {

    public static void main(String[] args) {
        int[] arr = {9, 1, 4, 2, 5, 2, 7, 5, 8, 6, 3, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int fact = 1;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr.length >= 0 && arr[0] >= 2 && arr[0] <= 8) {

                int n = arr[i];
                for (int x = 1; x <= n; x++) {
                    fact = fact * x;
                }
            }

        }
        System.out.println(fact);
    }
}
