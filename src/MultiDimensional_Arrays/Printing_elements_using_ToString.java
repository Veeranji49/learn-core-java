package MultiDimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Printing_elements_using_ToString {

    public static void main(String[] args) {

        int[][] arr = new int[3][2];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements :");

        //input
        for(int row =0; row <=arr.length-1; row++){
            for(int col=0; col<=arr[row].length-1; col++){
                arr[row][col]= sc.nextInt();
            }
        }

        //output
        for(int row=0; row<=arr.length-1; row++){
            System.out.println(Arrays.toString(arr[row])+" ");
        }
        System.out.println();






        //without scanner
        int[][] brr ={{1,2,3,4,5},{6,7,8,9,10},{11,21,31,41,51},{22,32,42,52,62}};

        //using for loop
        /*for(int row=0; row<=brr.length-1; row++){
            System.out.println(Arrays.toString(brr[row])+" ");
        }*/

        //using for-each loop
        for(int[] b : brr){
            System.out.println(Arrays.toString(b));
        }





    }
}
