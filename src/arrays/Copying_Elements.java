package arrays;

public class Copying_Elements {

    public static void main(String[] args) {

        //To copying the element from array to another array

        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int[] b = new int[a.length];

        for (int i = 0; i <= a.length - 1; i++) {
            b[i] = a[i];
        }
        System.out.println("After copying :");
        for (int i = 0; i <= b.length - 1; i++) {
            System.out.println(b[i]);
        }
    }
}
