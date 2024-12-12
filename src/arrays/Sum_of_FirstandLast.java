package arrays;

public class Sum_of_FirstandLast {

    public static void main(String[] args) {
        int[] arr = {9, 1, 4, 2, 5, 2, 7, 5, 8, 6, 3, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        if (arr.length >= 2) {
            int sum1 = arr[0] + arr[arr.length - 1];
            System.out.println(sum1);
        } else {
            System.out.println("There is no elements");
        }
    }
}
