package dsa.Searching.Linear_Search;

public class finding_element {

    public static void main(String[] args) {
        int[] aaa = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int target = 1;
        int ans = linearSearch(aaa, target);
        System.out.println("Element :" + ans);

    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            System.out.println("zero elements found");
        }

        for (int index = 0; index <= arr.length - 1; index++) {
            int element = arr[index];
            if (element == target) {
                // System.out.println("Element "+element+" found at index :"+index);
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }
}
