package DSA.Searching.Linear_Search;

public class Last_Occurance_of_element {
    public static void main(String[] args) {

        int[] arr = {4, 2, 8, 1, 9, 6, 3, 4, 4, 8};
        int target = 4;
        int index = findLastOccurrence(arr, target);
        if (index != -1) {
            System.out.println("Last occurrence of " + target + " at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }

    static int findLastOccurrence(int[] arr, int target) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // If element not found
    }
}
