package multidimensional_arrays;

public class Count_Occurance_elements {

    public static void main(String[] args) {

        int[][] array = {
                {1, 2, 2},
                {4, 5, 6},
                {1, 2, 3}
        };

        int target = 2;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == target) {
                    count++;
                }
            }
        }

        System.out.println("Element " + target + " occurs " + count + " times in the array.");

    }
}
