package Arrays;

public class Sorted_in_Ascending_order {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        boolean isSorted = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                isSorted = false;
                break;
            }
        }
        System.out.println("Array is sorted in ascending order: " + isSorted);
    }
}
