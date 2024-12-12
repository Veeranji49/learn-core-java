package strings;

import java.util.Scanner;

public class Swap_First_Last_character {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (input.length() <= 1) {
            System.out.println("Swapped string: " + input);
        } else {
            char first = input.charAt(0);
            char last = input.charAt(input.length() - 1);
            String middle = input.substring(1, input.length() - 1);
            String result = last + middle + first;
            System.out.println("Swapped string: " + result);
        }
    }
}
