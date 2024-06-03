package Arrays;

import java.util.Arrays;
import java.util.List;

public class Array_to_List {

    public static void main(String[] args) {

        String[] array = {"apple", "banana", "cherry"};
        List<String> list = Arrays.asList(array);
        System.out.println("List: " + list);
    }
}
