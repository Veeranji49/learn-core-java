package basic_programs;

import java.util.Scanner;

public class Sum_Of_Triangles {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter two triangels:");
        int p = x.nextInt();
        int q = x.nextInt();
        int r = 180 - (p + q);
        System.out.println(r);
    }
}
