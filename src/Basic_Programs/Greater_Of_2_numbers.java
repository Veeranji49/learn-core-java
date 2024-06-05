package Basic_Programs;

import java.util.Scanner;

public class Greater_Of_2_numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();
        int greater = (num1 > num2) ? num1 : num2;
        System.out.println("Greater number: " + greater);
        sc.close();
    }
}
