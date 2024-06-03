package MultiDimensional_Arrays;

public class Matrix_is_Symmetric {

    public static void main(String[] args) {

        int[][] array = {
                {1, 2, 3},
                {2, 5, 6},
                {3, 6, 9}
        };

        boolean isSymmetric = true;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] != array[j][i]) {
                    isSymmetric = false;
                    break;
                }
            }
            if (!isSymmetric) {
                break;
            }
        }

        if (isSymmetric) {
            System.out.println("The matrix is symmetric.");
        } else {
            System.out.println("The matrix is not symmetric.");
        }
    }
}
