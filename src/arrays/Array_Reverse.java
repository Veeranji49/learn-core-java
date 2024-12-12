package arrays;

public class Array_Reverse {

    public static void main(String[] args) {

        //Display array in Reverse order

        int[] arr = {9, 1, 4, 2, 5, 2, 7, 5, 8, 6, 3, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
