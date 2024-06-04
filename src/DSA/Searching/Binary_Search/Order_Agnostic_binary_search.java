package DSA.Searching.Binary_Search;

public class Order_Agnostic_binary_search {

    public static void main(String[] args) {
        int[] arr = {111, 101, 99, 76, 43, 21, 20, 17, 14, 12, -1, -6};
        int target = 12;
        int ans = noOrder(arr, target);
        System.out.println("index of element :" + ans);
    }

    //finding whether the array is ascending order or descending order
    static int noOrder(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {

            //finding the middle element
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            // if array is in ascending order
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            // if array in descending order
            else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        //if no value found returns -1
        return -1;
    }
}
