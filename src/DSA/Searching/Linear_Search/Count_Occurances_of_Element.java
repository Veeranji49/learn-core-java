package DSA.Searching.Linear_Search;

public class Count_Occurances_of_Element {

    public static void main(String[] args) {

        int[] arr = {4, 2, 8, 1, 9, 6, 3, 4, 4, 8};
        int target = 4;
        int count = countOccurrences(arr, target);
        System.out.println("Occurrences of " + target + " in the array: " + count);
    }

    static int countOccurrences(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }
}