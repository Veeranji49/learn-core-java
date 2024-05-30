package Loops.For_Loop;

public class for_Loop {

    public static void main(String[] args) {

        // The syntax of for loop :
       /*
            for (initialExpression; condition; increment/decrement) {
                 // body of the loop
            }
        */


        // To print hello world four times
        for (int i = 1; i <= 4; i += 1) {
            System.out.println("Hello World");
        }


        //To Print 1-5 numbers
        for (int j = 1; j <= 5; j += 1) {
            System.out.println("num:" + j);
        }

        //To calculate the sum of numbers from 1 to 10
        double sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println("Sum:" + sum);


        //To print even numbers from 1 to 20
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("Even numbers : " + i);
            }
        }

        //To reverse the numbers from 2 to 16
        for (int i = 16; i >= 1; i--) {
            System.out.println("Reversed :" + i);
        }

        //To reverse the odd numbers from 3 to 17
        for (int i = 17; i >= 3; i--) {
            if (i % 2 != 0) {
                System.out.println("Odd numbers :" + i);
            }
        }

        //To factorial of a number
        int n = 5;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial  :" + fact);


        //Program to print Fibonacci series up to 10 terms.
        int n1 = 0, n2 = 1, n3;
        System.out.print(n1 + " " + n2);
        for (int i = 2; i < 10; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }

        //program to print multiplication table of 5
        int num = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }


        //program to print the number is prime number or not
        int count = 0;
        int x = 45;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not prime number");
        }


        //program to print prime numbers from 1 to 50
        for (int i = 1; i <= 50; i++) {
            int cnt = 0;
            int y = i;
            for (int j = 1; j <= y; j++) {
                if (y % j == 0) {
                    cnt++;
                }
            }
            if (cnt == 2) {
                System.out.println("Prime number :" + y);
            }
        }

        //Program to print the multiplication table of a number entered by the user.
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int num1 = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num1 + " * " + i + " = " + (num1 * i));
        }*/


        //Program to print the factorial of numbers from 1 to 10.
        for (int i = 1; i <= 10; i++) {
            int m = i;
            int factorial = 1;
            for (int h = 1; h <= m; h++) {
                factorial = factorial * h;
            }
            System.out.println("factorial numbers :" + factorial);
        }


        //program to print sum of first n natural numbers
        int summ = 0;
        int o = 10;
        for (int i = 1; i <= o; i++) {
            summ = summ + i;
        }
        System.out.println("sum of first" + " " + o + " " + "natural numbers :" + " " + summ);


        //sum of digits of a number
        int number = 12345;
        int sum1 = 0;
        for (int i = number; i > 0; i /= 10) {
            sum1 += i % 10;
        }
        System.out.println("Sum of digits: " + sum1);


        //calculate the power of a number
        int base = 2, exponent = 3;
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        System.out.println("Power: " + result);


        //average of a given number
        int nu = 11;
        double sum2 = 0;
        for (int i = 1; i <= nu; i++) {
            sum2 = sum2 + i;
        }
        double avg = sum2 / nu;
        System.out.println("Average:" + avg);


        //square from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("square :" + (i * i));
        }

        //sum of square of first n numbers
        int d = 5;
        int total = 0;
        for (int i = 1; i <= d; i++) {
            total = total + i * i;
        }
        System.out.println("sum of square :" + total); // 1+4+9+16+25 = 55


        //print numbers that are divisible by 3 and 5
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("divisible byt 3 and 5" + "=" + i);
            }
        }


        // Print all numbers from 1 to n that are neither divisible by 2 nor 5
        int n4 = 50;
        for (int i = 1; i <= n4; i++) {
            if (i % 2 != 0 && i % 5 != 0) {
                System.out.println(i);
            }
        }


        //print the perfect number
        int n5 = 6;
        int sum3 = 0;
        for (int i = 1; i < n5; i++) {
            if (n5 % i == 0) {
                sum3 = sum3 + i;
            }
        }
        if (sum3 == n5) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not Perfect Number");
        }


        //To print perfect numbers from 1 to 100
        for (int u = 1; u <= 100; u++) {
            int sum4 = 0;
            for (int i = 1; i < u; i++) {
                if (u % i == 0) {
                    sum4 = sum4 + i;
                }
            }
            if (sum4 == u) {
                System.out.println("perfect : " + u);
            }
        }


        // checking a year is leap year or not
        int year = 2024;
        boolean isLeapYear = false;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            isLeapYear = true;
        }
        System.out.println(year + " is " + (isLeapYear ? "" : "not ") + "a leap year.");


        // print all factors of a number
        int number1 = 36;
        System.out.print("Factors of " + number1 + ": ");
        for (int i = 1; i <= number1; i++) {
            if (number1 % i == 0) {
                System.out.print(i + " ");
            }
        }
        // Generate the series 1, 4, 9, 16, 25, ... up to 100
        for (int anji = 1; anji * anji <= 100; anji++) {
            System.out.println(anji * anji + " ");
        }



         //  Program to Print Numbers from 1 to 100 That Are Divisible by 7
        for(int i =1; i<=100; i++){
            if(i%7==0){
                System.out.println(i);
            }
        }


        // Program to Print Numbers from 1 to 100 That Are Neither Divisible by 3 Nor 7
        for (int i = 1; i <= 100; i++) {
            if (i % 3 != 0 && i % 7 != 0) {
                System.out.println(i);
            }
        }


        // Program to Print Numbers from 1 to 50 and Identify if They Are Odd or Even
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }
        }

        // program to print sum of prime numbers from 1 to 20
        int sum5 = 0;
        for(int i=1; i<=20; i++){
            int count1 = 0;
            for(int j =1; j<=i; j++){
                if(i%j==0){
                    count1++;
                }
            }
            if(count1==2){
                sum5 = sum5 + i;
            }
        }
        System.out.println(sum5);


        // Program to Print the Product of All Numbers from 1 to 10
        int product = 1;
        for (int i = 1; i <= 10; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 10: " + product);














































        
    }
}