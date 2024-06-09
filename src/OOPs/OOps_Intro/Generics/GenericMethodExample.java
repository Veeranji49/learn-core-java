package OOPs.OOps_Intro.Generics;

public class GenericMethodExample {

    // A generic method that accepts an array of any type and prints its elements
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Calling the generic method with Integer array
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.print("Integer Array: ");
        printArray(intArray);

        // Calling the generic method with String array
        String[] stringArray = {"Java", "is", "awesome"};
        System.out.print("String Array: ");
        printArray(stringArray);
    }
}