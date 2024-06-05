package Basic_Programs;

import java.util.Scanner;

public class Kilometeres_To_Miles {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in kilometers:");
        double kilometers = sc.nextDouble();

        double miles = kilometers * 0.621371;
        System.out.println("Distance in miles: " + miles);
        sc.close();
    }
}
