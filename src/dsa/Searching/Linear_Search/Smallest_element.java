package dsa.Searching.Linear_Search;

public class Smallest_element {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, -2};
        int ans = smallestElement(arr);
        System.out.println("smallest element :" + ans);
    }

    static int smallestElement(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }

        int small = arr[0];
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] < small) {
                small = arr[i];
            }
        }
        return small;
    }
}
