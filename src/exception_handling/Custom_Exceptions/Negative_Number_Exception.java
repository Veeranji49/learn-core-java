package exception_handling.Custom_Exceptions;

class NegativeNumberException extends Exception {
    NegativeNumberException(String message) {
        super(message);
    }
}

public class Negative_Number_Exception {
    static void validateNumber(int num) throws NegativeNumberException {
        if (num < 0) {
            throw new NegativeNumberException("Number cannot be negative");
        }
        System.out.println("Valid number: " + num);
    }

    public static void main(String[] args) {
        try {
            validateNumber(10);
            validateNumber(-5);
        } catch (NegativeNumberException e) {
            System.out.println("Caught NegativeNumberException: " + e.getMessage());
        }
    }

}
