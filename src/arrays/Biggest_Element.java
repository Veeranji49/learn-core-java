package arrays;

public class Biggest_Element {

    public static void main(String[] args) {

        //finding the biggest element in an array

        int[] arr = {9, 1, 4, 2, 5, 2, 7, 5, 8, 6, 3, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int big = arr[0];
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] > big) {
                big = arr[i];
            }
        }
        System.out.println(big);
    }
}
