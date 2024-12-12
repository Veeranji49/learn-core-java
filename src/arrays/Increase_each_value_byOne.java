package arrays;

public class Increase_each_value_byOne {

    public static void main(String[] args) {

        //Increase Each value by one

        int[] arr = {9, 1, 4, 2, 5, 2, 7, 5, 8, 6, 3, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = arr[i] + 1;
        }
        System.out.println("The array Increase by 1:");
        for (int x : arr) {
            System.out.println(x);
        }
    }
}
