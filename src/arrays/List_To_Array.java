package arrays;

import java.util.ArrayList;
import java.util.List;

public class List_To_Array {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");

        String[] array = new String[list.size()];
        list.toArray(array);
        System.out.println("Array: " + java.util.Arrays.toString(array));
    }
}
