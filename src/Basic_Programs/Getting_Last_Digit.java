package Basic_Programs;

import java.util.Scanner;

public class Getting_Last_Digit {
    public static void main(String[] args) {

        Scanner x=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=x.nextInt();
        int d=n%10;
        System.out.println(d);
    }
}
