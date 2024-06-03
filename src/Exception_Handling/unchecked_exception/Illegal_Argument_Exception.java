package Exception_Handling.unchecked_exception;

public class Illegal_Argument_Exception {

    public static void main(String[] args) {
        int num = -10;
        if (num < 0) {
            throw new IllegalArgumentException("Number must be positive");
        }
    }
}
