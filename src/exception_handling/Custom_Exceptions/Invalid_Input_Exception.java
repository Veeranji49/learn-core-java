package exception_handling.Custom_Exceptions;


class InvalidInputException extends Exception {
    InvalidInputException(String message) {
        super(message);
    }
}

public class Invalid_Input_Exception {

    static void validateInput(String input) throws InvalidInputException {
        if (input.isEmpty()) {
            throw new InvalidInputException("Input cannot be empty");
        }
        System.out.println("Valid input: " + input);
    }

    public static void main(String[] args) {
        try {
            validateInput("Hello");
            validateInput("");
        } catch (InvalidInputException e) {
            System.out.println("Caught InvalidInputException: " + e.getMessage());
        }
    }
}
