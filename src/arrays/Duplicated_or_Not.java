package arrays;

public class Duplicated_or_Not {

    public static void main(String[] args) {

        //The element is duplicated or not in array

        int[] arr = {9, 1, 4, 2, 5, 2, 7, 5, 8, 6, 3, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int count = 0;
        int ele = 7;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == ele) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("The element is not present");
        } else if (count == 1) {
            System.out.println("The element is not duplicated");
        } else if (count == 2) {
            System.out.println("The element is duplicated");
        } else {
            System.out.println("");
        }

    }
}
