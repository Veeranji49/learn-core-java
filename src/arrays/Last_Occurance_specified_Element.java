package arrays;

public class Last_Occurance_specified_Element {
    public static void main(String[] args) {

        //Last Occurance of specified element in array

        int[] arr = {9, 1, 4, 2, 5, 2, 7, 5, 8, 6, 3, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int ele = 8;
        boolean found = false;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == ele) {
                System.out.println("Found location:" + i);
                found = true;

            }
        }
        if (!found) {
            System.out.println("The element is not found");
        }
    }
}
