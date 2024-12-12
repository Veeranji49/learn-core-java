package basic_programs;

import java.util.Scanner;

public class Time_To_Minutes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hours:");
        int hours = sc.nextInt();
        System.out.println("Enter minutes:");
        int minutes = sc.nextInt();

        int totalMinutes = (hours * 60) + minutes;
        System.out.println("Total minutes: " + totalMinutes);
        sc.close();
    }
}
