package basic_programs;

import java.util.Scanner;

public class Hypotenuse_Of_Trinangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of side a:");
        double a = sc.nextDouble();
        System.out.println("Enter the length of side b:");
        double b = sc.nextDouble();

        double hypotenuse = Math.sqrt(a * a + b * b);
        System.out.println("Hypotenuse of the triangle: " + hypotenuse);
        sc.close();
    }
}
