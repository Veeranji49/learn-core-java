package DSA.Searching.Linear_Search;

public class First_Occurance_of_Element {

    public static void main(String[] args) {

        int[] arr = {4, 2, 8, 1, 9, 6, 3, 4, 4, 8};
        int target = 4;
        int index = findFirstOccurrence(arr, target);
        if (index != -1) {
            System.out.println("First occurrence of " + target + " at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }

    static int findFirstOccurrence(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // If element not found
    }
}

