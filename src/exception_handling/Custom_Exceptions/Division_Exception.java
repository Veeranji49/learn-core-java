package exception_handling.Custom_Exceptions;


class DivideByZeroException extends Exception {
    DivideByZeroException(String message) {
        super(message);
    }
}

public class Division_Exception{
    static void divide(int num, int denom) throws DivideByZeroException {
        if (denom == 0) {
            throw new DivideByZeroException("Cannot divide by zero");
        }
        System.out.println("Result: " + (num / denom));
    }

    public static void main(String[] args) {
        try {
            divide(10, 2);
            divide(10, 0);
        } catch (DivideByZeroException e) {
            System.out.println("Caught DivideByZeroException: " + e.getMessage());
        }
    }
}
