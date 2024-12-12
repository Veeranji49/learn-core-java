package multidimensional_arrays;

public class Swap_Two_Rows {

    public static void main(String[] args) {

        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int row1 = 0;
        int row2 = 2;

        // Swap rows
        int[] temp = array[row1];
        array[row1] = array[row2];
        array[row2] = temp;

        // Print the array after swapping
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
