package Exception_Handling.unchecked_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input_Mismatch_Exception {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt(); // InputMismatchException
            System.out.println("Number: " + num);
        } catch (InputMismatchException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
