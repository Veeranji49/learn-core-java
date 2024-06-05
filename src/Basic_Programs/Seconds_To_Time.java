package Basic_Programs;

import java.util.Scanner;

public class Seconds_To_Time {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of seconds:");
        int seconds = sc.nextInt();

        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;

        System.out.println(seconds + " seconds is equal to " + hours + " hours, " + minutes + " minutes, and " + remainingSeconds + " seconds.");
        sc.close();
    }
}
