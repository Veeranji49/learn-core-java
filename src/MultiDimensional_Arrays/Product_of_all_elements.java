package MultiDimensional_Arrays;

public class Product_of_all_elements {

    public static void main(String[] args) {

        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int product = 1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                product *= array[i][j];
            }
        }

        System.out.println("Product of all elements: " + product);
    }
}
