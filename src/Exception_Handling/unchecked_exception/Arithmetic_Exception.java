package Exception_Handling.unchecked_exception;

public class Arithmetic_Exception {

    public static void main(String[] args) {

            int numerator = 10;
            int denominator = 0;
            int result = numerator / denominator; // ArithmeticException
            System.out.println("Result: " + result);

    }
}
