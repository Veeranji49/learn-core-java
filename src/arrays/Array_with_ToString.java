package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array_with_ToString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // array of primitives
        int[] arr = new int[8];
        System.out.println("Enter array elements :");

        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}
