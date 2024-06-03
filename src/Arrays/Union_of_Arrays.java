package Arrays;

import java.util.HashSet;
import java.util.Set;

public class Union_of_Arrays {

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};
        Set<Integer> union = new HashSet<>();
        for (int num : array1) {
            union.add(num);
        }
        for (int num : array2) {
            union.add(num);
        }
        System.out.println("Union: " + union);
    }
}
