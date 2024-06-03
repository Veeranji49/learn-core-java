package MultiDimensional_Arrays;

public class Searching_Element {

    public static void main(String[] args) {

        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int target = 5;
        boolean found = false;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == target) {
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        if (found) {
            System.out.println("Element " + target + " found in the array.");
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
