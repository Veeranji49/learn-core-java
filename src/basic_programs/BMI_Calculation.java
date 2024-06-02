package basic_programs;

import java.util.Scanner;

public class BMI_Calculation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight in kilograms:");
        double weight = sc.nextDouble();
        System.out.println("Enter height in meters:");
        double height = sc.nextDouble();

        double bmi = weight / (height * height);
        System.out.println("BMI: " + bmi);
        sc.close();
    }
}
