package basic_programs;

import java.util.Scanner;

public class Dozen_Bananas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Cost:");
        double cost = sc.nextDouble();
        System.out.println("Enter quantity:");
        double quantity = sc.nextDouble();
        double amount = (quantity / 12) * cost;
        System.out.println("Total cost: " + amount);

        sc.close();
    }
}
