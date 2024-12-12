package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Of_Objects {

    public static void main(String[] args) {

        // array of objects
        String[] str = new String[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter characters :");

        for (int i = 0; i <= str.length - 1; i++) {
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));// It will give with full brackets, commas

        //modify
        str[3] = "anji";
        System.out.println(Arrays.toString(str));
    }
}
