package Basic_Programs;

import java.util.Scanner;

public class Minutes_To_Hours {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of minutes:");
        int minutes = sc.nextInt();

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        System.out.println(minutes + " minutes is equal to " + hours + " hours and " + remainingMinutes + " minutes.");
        sc.close();
    }
}
