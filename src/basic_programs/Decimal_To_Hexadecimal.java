package basic_programs;

import java.util.Scanner;

public class Decimal_To_Hexadecimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number:");
        int decimal = sc.nextInt();

        String hex = Integer.toHexString(decimal).toUpperCase();
        System.out.println("Hexadecimal equivalent: " + hex);
        sc.close();
    }
}
