package Arrays;

public class Sum_Of_Even_and_Odd {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sumEven = 0, sumOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sumEven += array[i];
            } else {
                sumOdd += array[i];
            }
        }
        System.out.println("Sum of elements in even positions: " + sumEven);
        System.out.println("Sum of elements in odd positions: " + sumOdd);
    }
}
