package swith_statements;

import java.util.Scanner;

public class Program_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dice no :");
        int dice = sc.nextInt();

        switch (dice){

            case 1 :
                System.out.println("single");
                break;

            case 2 :
                System.out.println("double");
                break;

            case 3 :
                System.out.println("three");
                break;

            case 4 :
                System.out.println("four");
                break;

            case 5 :
                System.out.println("five");
                break;

            case 6 :
                System.out.println("six");
                break;

            case 7 :
                System.out.println("seven");
                break;

            default:
                System.out.println("Enter a valid number");

        }
    }
}
