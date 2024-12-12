package dsa.Sorting.Bubble_Sort;

import java.util.Scanner;

public class Bubble_Sort_with_User_Input {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Unsorted array:");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();

        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }

        System.out.println("Sorted array:");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();

    }
}
