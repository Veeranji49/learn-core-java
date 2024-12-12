package arrays;

import java.util.Scanner;

public class Read_Array_Values_from_user {

    public static void main(String[] args) {

        //Read Array Values from user input

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");

        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter" + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements are:");
        for (int x : arr) {
            System.out.println(x);
        }

    }
}
