package dsa.Searching.Linear_Search;

import java.util.Arrays;

public class Search_in_2D_Array {

    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6, 7},
                {112, 32, 75, 98, 21},
                {34, 97}
        };
        int target = 7;  // [1,3]
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target) {
        if (arr.length == 0) {
            return new int[]{-1};
        }

        for (int rows = 0; rows <= arr.length - 1; rows++) {
            for (int cols = 0; cols <= arr[rows].length - 1; cols++) {
                if (arr[rows][cols] == target) {
                    return new int[]{rows, cols};
                }
            }
        }
        return new int[]{-1};
    }
}
