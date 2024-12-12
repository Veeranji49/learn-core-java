package strings;

import java.util.Scanner;

public class Replace_character_in_String {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.print("Enter the character to be replaced: ");
        char oldChar = scanner.next().charAt(0);
        System.out.print("Enter the replacement character: ");
        char newChar = scanner.next().charAt(0);

        String newString = input.replace(oldChar, newChar);
        System.out.println("Updated string: " + newString);
    }
}
