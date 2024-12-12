package multidimensional_arrays;

public class Positive_elements_or_not {

    public static void main(String[] args) {

        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        boolean allPositive = true;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] <= 0) {
                    allPositive = false;
                    break;
                }
            }
            if (!allPositive) {
                break;
            }
        }

        if (allPositive) {
            System.out.println("All elements are positive.");
        } else {
            System.out.println("Not all elements are positive.");
        }
    }
}
