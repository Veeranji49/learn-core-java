package Exception_Handling.checked_exception;

import java.util.Scanner;

public class Number_Format {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter an integer: ");
            int num = Integer.parseInt(scanner.nextLine());
            System.out.println("You entered: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
        scanner.close();
    }
}
