package DSA.Searching.Linear_Search;

public class All_Occurances_of_an_element {

    public static void main(String[] args) {
        int[] arr = {4, 2, 8, 1, 9, 6, 3, 4, 4, 8};
        int target = 4;
        findAllOccurrences(arr, target);
    }

    static void findAllOccurrences(int[] arr, int target) {
        System.out.print("Occurrences of " + target + " at indexes: ");
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.print(i + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Element not found in the array.");
        }
    }
}
