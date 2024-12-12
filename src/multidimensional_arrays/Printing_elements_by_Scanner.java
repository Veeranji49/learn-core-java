package multidimensional_arrays;

import java.util.Scanner;

public class Printing_elements_by_Scanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];

        //input
        System.out.println("Enter array elements :");
        for(int row =0; row<=arr.length-1; row++){
            for(int col =0; col<=arr[row].length-1; col++){
                arr[row][col] = sc.nextInt();
            }
        }

        //output
        for(int row =0; row<=arr.length-1; row++){
            for(int col=0; col<=arr[row].length-1; col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }
}
