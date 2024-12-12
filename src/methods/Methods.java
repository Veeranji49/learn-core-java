package methods;

import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {

        String message = msg();
        System.out.println(message);

       // num1();

        int num = num2();
        System.out.println(num);

        int num1 = num3(6,3);
        System.out.println(num1);


       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter msg :");
        String messageee = sc.next();
        String mg = hello(messageee);
        //System.out.println(mg);*/


        swap(3,5);


        int[] arr= {9,1,4,2,5,2,7,5,8,6,3,1,2,3,4,5,6,7,8,9,10};
        Methods.display(arr);


        int[] x=Methods.display1();
        System.out.println("Array elements:");
        for(int i=0; i<=x.length-1; i++)
        {
            System.out.println(x[i]);
        }
    }


    // return the msg
    static String msg(){
        String msg = "Hello , How are you anji ?";
        return  msg ;
    }


    // calling method from  main method
    static void num1 (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum is :"+ sum);
    }


    // to return the values
    static int num2(){
        int a = 2, b=4 , c;
        c = a * b ;
        return   c ;
    }


    static int num3(int a, int b){
        return a/b;
    }


    //paasing the value to the method and calling method in main
    static String hello(String msg){
        String message = "Hello"+" "+msg;
        return message;
    }



    static void swap(int a,int b){
        System.out.println("Before swap: a = " + a + ", b = " + b);
        a = a + b; // Step 1: a now contains the sum of a and b
        b = a - b; // Step 2: b now contains the original value of a
        a = a - b; // Step 3: a now contains the original value of b
        System.out.println("After swap: a = " + a + ", b = " + b);
    }


    // passing array to method
    static void display(int[] x)
    {
        System.out.println("Array element:");
        for(int i=0; i<=x.length-1;i++)
        {
            System.out.print(x[i]+" ");
        }
    }


    // return an array from method
    static int[] display1()
    {
        int[] arr= {10,20,30,40,50};
        return arr;
    }

}
