package arrays;

public class Largest_of_Two_elements {

    public static void main(String[] args) {
        int[] arr = {9, 1, 4, 2, 5, 2, 7, 5, 8, 6, 3, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int largest = 0;
        if (arr.length >= 2) {
            if (arr[0] > 0 && arr[1] > 0) {
                largest = Math.max(arr[0], arr[1]);
                System.out.println("largest:" + largest);
            } else {
                System.out.println("There is no positive elements");
            }
        } else {
            System.out.println("length is less than two elements");
        }
    }
}
