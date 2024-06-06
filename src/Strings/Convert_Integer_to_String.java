package Strings;

import java.util.Scanner;

public class Convert_Integer_to_String {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        String str = Integer.toString(number);
        System.out.println("Converted string: " + str);
    }
}
