package DSA.Searching.Linear_Search;

public class Search_in_Range {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 9;
        boolean ans = searchInRange(arr, target, 2, 7);
        System.out.println(ans);
    }

    // searching elements in range between 2 to 7
    static boolean searchInRange(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return false;
        }

        for (int index = start; index <= end; index++) {
            if (target == arr[index]) {
                return true;
            }
        }
        return false;
    }
}
