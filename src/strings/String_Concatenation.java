package strings;

import java.util.Scanner;

public class String_Concatenation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String firstString = scanner.nextLine();
        System.out.print("Enter second string: ");
        String secondString = scanner.nextLine();
        String concatenatedString = firstString + secondString;
        System.out.println("Concatenated string: " + concatenatedString);
    }
}
