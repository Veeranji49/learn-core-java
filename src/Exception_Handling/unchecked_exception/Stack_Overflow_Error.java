package Exception_Handling.unchecked_exception;

public class Stack_Overflow_Error {

    public static void main(String[] args) {
        recursiveMethod(); // StackOverflowError
    }

    public static void recursiveMethod() {
        recursiveMethod();
    }
}
