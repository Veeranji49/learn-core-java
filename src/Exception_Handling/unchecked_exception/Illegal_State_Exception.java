package Exception_Handling.unchecked_exception;

import java.util.ArrayList;
import java.util.List;

public class Illegal_State_Exception {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.iterator().remove(); // IllegalStateException
    }
}
