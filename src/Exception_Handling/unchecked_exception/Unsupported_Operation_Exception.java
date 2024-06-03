package Exception_Handling.unchecked_exception;

import java.util.Collections;
import java.util.List;

public class Unsupported_Operation_Exception {

    public static void main(String[] args) {

        List<Integer> list = Collections.emptyList();
        list.add(1); // UnsupportedOperationException
    }
}
