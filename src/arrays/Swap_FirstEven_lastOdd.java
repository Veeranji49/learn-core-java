package arrays;

public class Swap_FirstEven_lastOdd {

    public static void main(String[] args) {

        //Swap the first Even number with last odd number in array

        int[] arr = {9, 1, 4, 2, 5, 2, 7, 5, 8, 6, 3, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int first = -1;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] % 2 == 0) {
                first = i;
                break;
            }
        }
        int last = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] % 2 != 0) {
                last = i;
                break;
            }
        }

        if (first != -1 && last != -1) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            System.out.println("After the swap:");

            for (int i : arr) {
                System.out.println(i);
            }

        } else {
            System.out.println("elements not found");
        }
    }
}
