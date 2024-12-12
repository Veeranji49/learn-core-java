package multidimensional_arrays;

public class Diagonal_Sum {

    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for (int i = 0; i < array.length; i++) {
            primaryDiagonalSum += array[i][i];
            secondaryDiagonalSum += array[i][array.length - i - 1];
        }

        System.out.println("Primary diagonal sum: " + primaryDiagonalSum);
        System.out.println("Secondary diagonal sum: " + secondaryDiagonalSum);
    }
}
