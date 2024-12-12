package dsa.Searching.Linear_Search;

public class Finding_index_of_element {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 19;
        int ans = linearSearch(nums, target);
        System.out.println("index of element :" + ans);
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            System.out.println("length of array is 0");
        }

        for (int index = 0; index <= arr.length - 1; index++) {
            int element = arr[index];
            if (element == target) {
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }
}
