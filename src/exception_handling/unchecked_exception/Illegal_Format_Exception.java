package exception_handling.unchecked_exception;

import java.util.Scanner;

public class Illegal_Format_Exception {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner("123abc");
            int num = scanner.nextInt(); // InputMismatchException
            System.out.println("Number: " + num);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
