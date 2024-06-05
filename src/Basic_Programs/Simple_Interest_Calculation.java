package Basic_Programs;

import java.util.Scanner;

public class Simple_Interest_Calculation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal amount:");
        double principal = sc.nextDouble();
        System.out.println("Enter rate of interest:");
        double rate = sc.nextDouble();
        System.out.println("Enter time (in months):");
        double time = sc.nextDouble();
        double interest = (principal * rate * time) / 100;
        System.out.println("Simple interest: " + interest);
        sc.close();
    }

}
