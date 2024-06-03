package MultiDimensional_Arrays;

public class Count_positive_negative_0_elements {

    public static void main(String[] args) {

        int[][] array = {
                {1, -2, 3},
                {-4, 0, 6},
                {7, -8, 9}
        };

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    positiveCount++;
                } else if (array[i][j] < 0) {
                    negativeCount++;
                } else {
                    zeroCount++;
                }
            }
        }

        System.out.println("Positive elements: " + positiveCount);
        System.out.println("Negative elements: " + negativeCount);
        System.out.println("Zero elements: " + zeroCount);
    }
}
