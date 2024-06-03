package MultiDimensional_Arrays;

public class Swap_2_columns {

    public static void main(String[] args) {

        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int col1 = 0;
        int col2 = 2;

        // Swap columns
        for (int i = 0; i < array.length; i++) {
            int temp = array[i][col1];
            array[i][col1] = array[i][col2];
            array[i][col2] = temp;
        }

        // Print the array after swapping
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
