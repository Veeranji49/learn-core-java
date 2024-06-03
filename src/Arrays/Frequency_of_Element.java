package Arrays;

public class Frequency_of_Element {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 2, 4, 5};
        int element = 2;
        int frequency = 0;
        for (int num : array) {
            if (num == element) {
                frequency++;
            }
        }
        System.out.println("Frequency of " + element + ": " + frequency);
    }
}
