package arrays;

public class Display_sum_of_Array_using_forLoop {

    public static void main(String[] args) {

        //Display sum of Array elements using For Loop

        int[] arr = {9, 1, 4, 2, 5, 2, 7, 5, 8, 6, 3, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum = 0;

        for (int i = 0; i <= arr.length - 1; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);

    }
}
