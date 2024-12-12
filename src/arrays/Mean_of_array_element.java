package arrays;

public class Mean_of_array_element {

    public static void main(String[] args) {

        //finding the mean of an array elements

        int[] arr = {9, 1, 4, 2, 5, 2, 7, 5, 8, 6, 3, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum = 0;

        for (int i = 0; i <= arr.length - 1; i++) {
            sum = sum + arr[i];

        }
        double mean = sum / arr.length;
        System.out.println("Mean:" + mean);
    }
}
