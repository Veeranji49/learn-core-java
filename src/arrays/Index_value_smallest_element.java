package arrays;

public class Index_value_smallest_element {

    public static void main(String[] args) {

        //Index value of smallest element in array

        int[] arr = {9, 1, 4, 2, 5, 2, 7, 5, 8, 6, 3, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int smallElementIndex = 0;

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] < arr[smallElementIndex]) {
                smallElementIndex = i;
            }
        }
        System.out.println("The index of small element in array:" + smallElementIndex);
    }
}
