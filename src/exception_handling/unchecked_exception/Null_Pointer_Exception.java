package exception_handling.unchecked_exception;

public class Null_Pointer_Exception {

    public static void main(String[] args) {

        String str = null;
        System.out.println(str.length()); // NullPointerException
    }
}
