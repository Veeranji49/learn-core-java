package dsa.Searching.Binary_Search;

public class Binary_Search_in_Ascending {

    public static void main(String[] args) {
        //sorting in ascending order
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int target = 2;
        int ans = binarySearch(arr, target);
        System.out.println("index of an element :" + ans);
    }

    //return the index of element
    static int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            //finding the middle element
            int mid = start + (end - start) / 2;

            if (target < mid) {
                end = mid - 1;
            } else if (target > mid) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
