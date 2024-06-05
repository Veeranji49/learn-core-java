package Basic_Programs;

import java.util.Scanner;

public class Total_Salary_of_Employee {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.println("Enter salary");
        double basic = x.nextDouble();
        double hra = 0.25 * basic;
        double ta = 0.2 * basic;
        double da = 0.15 * basic;
        double total = hra + ta + da + basic;
        System.out.println(total);
    }
}
