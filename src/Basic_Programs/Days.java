package Basic_Programs;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter days:");
        int days = x.nextInt();
        int years = days / 365;
        int weeks = (days % 365) / 7;
        int days1 = days - ((years * 365) + (weeks * 7));
        System.out.println(years + " " + "years," + " " + weeks + " " + "Weeks," + " " + days1 + " " + "days");
    }
}
