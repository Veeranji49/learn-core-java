package multidimensional_arrays;

public class Sum_Of_Each_Column {

    public static void main(String[] args) {

        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int j = 0; j < array[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i][j];
            }
            System.out.println("Sum of elements in column " + j + ": " + sum);
        }
    }
}
