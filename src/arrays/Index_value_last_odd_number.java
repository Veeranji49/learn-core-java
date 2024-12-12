package arrays;

public class Index_value_last_odd_number {

    public static void main(String[] args) {

        //Index value of last odd number

        int[] arr = {9, 1, 4, 2, 5, 2, 7, 5, 8, 6, 3, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int lastIndex = -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] % 2 != 0) {
                lastIndex = i;
                break;
            }
        }
        if (lastIndex != -1) {
            System.out.println(lastIndex);
        } else {
            System.out.println("No elements found");
        }
    }
}
