package Strings;

import java.util.Scanner;

public class Convert_String_to_UpperCase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String upperCase = input.toUpperCase();
        System.out.println("Uppercase string: " + upperCase);
    }
}
