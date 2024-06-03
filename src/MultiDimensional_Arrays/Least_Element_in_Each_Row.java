package MultiDimensional_Arrays;

public class Least_Element_in_Each_Row {

    public static void main(String[] args) {

        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < array.length; i++) {
            int min = array[i][0];
            for (int j = 1; j < array[i].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
            System.out.println("Minimum element in row " + i + ": " + min);
        }
    }
}
