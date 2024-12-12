package dsa.Searching.Linear_Search;

public class search_min_element_in_range {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int ans = range(arr, 3, 7);
        System.out.println("smallest element in range 3 to 7 :" + ans);
    }

    static int range(int[] arr, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        int smallest = arr[start]; // Start with the first element in the range
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }
}
