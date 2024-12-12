package exception_handling.unchecked_exception;

import java.util.ArrayList;
import java.util.List;

public class Concurent_Modification_Exception {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        for (Integer num : list) {
            list.remove(num); // ConcurrentModificationException
        }
    }
}
