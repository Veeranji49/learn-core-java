package strings;

import java.util.Scanner;

public class Count_Vowels_Consonants_in_Strings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase();

        int vowelsCount = 0;
        int consonantsCount = 0;

        for (char c : input.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowelsCount++;
                } else {
                    consonantsCount++;
                }
            }
        }

        System.out.println("Number of vowels: " + vowelsCount);
        System.out.println("Number of consonants: " + consonantsCount);
    }
}
