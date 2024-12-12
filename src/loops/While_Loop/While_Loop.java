package loops.While_Loop;

public class While_Loop {

    public static void main(String[] args) {

        /*

            Syntax of While Loop :
                while(condition){
                    //body
                }

         */

        // program to print numbers from 1 to 10
        int j=1;
        while(j<=10){
            System.out.println(j);
            j++;
        }


        //  Program to Print Numbers from 1 to 100 That Are Divisible by 5
            int j1 = 1;
            while (j1 <= 100) {
                if (j1 % 5 == 0) {
                    System.out.println(j1);
                }
                j1++;
            }


        //Program to Find the Sum of the Digits of a Number
        int number = 12345;
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("Sum of digits: " + sum);


        //  Program to Reverse a Number
        int number1 = 12345;
        int reverse = 0;
        while (number1 != 0) {
            int digit = number1 % 10;
            reverse = reverse * 10 + digit;
            number1 /= 10;
        }
        System.out.println("Reversed Number: " + reverse);



        // Program to Check if a Number is Prime
        int number2 = 29;
        boolean isPrime = true;
        int i = 2;
        while (i <= Math.sqrt(number2)) {
            if (number2 % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }
        if (isPrime) {
            System.out.println(number2 + " is a prime number.");
        } else {
            System.out.println(number2 + " is not a prime number.");
        }


         //  Program to Calculate the Factorial of a Number
        int number3 = 5;
        int fact = 1;
        int i1 = 1;
        while (i1 <= number3) {
            fact *= i1;
            i1++;
        }
        System.out.println("Factorial of " + number3 + " is: " + fact);


        // Program to Calculate the Power of a Number
        int base = 3, exponent = 4;
        int result = 1;
        int i2 = 1;
        while (i2 <= exponent) {
            result *= base;
            i2++;
        }
        System.out.println(base + " to the power of " + exponent + " is " + result);



        // Program to Check if a Number is a Perfect Number
        int number4 = 28;
        int sum1 = 0;
        int i3 = 1;
        while (i3 < number4) {
            if (number4 % i3 == 0) {
                sum1 += i3;
            }
            i3++;
        }
        if (sum1 == number4) {
            System.out.println(number4 + " is a perfect number");
        } else {
            System.out.println(number4 + " is not a perfect number");
        }



        // Program to Calculate the Sum of Even Numbers between 1 and 100
        int sum4 = 0;
        int i4 = 1;
        while (i4 <= 100) {
            if (i4 % 2 == 0) {
                sum4 += i4;
            }
            i4++;
        }
        System.out.println("Sum of even numbers between 1 and 100: " + sum4);


        //  Program to Find the Largest Digit in a Number
        int number5 = 572839;
        int largestDigit = 0;
        while (number5 != 0) {
            int digit = number5 % 10;
            if (digit > largestDigit) {
                largestDigit = digit;
            }
            number5 /= 10;
        }
        System.out.println("Largest digit: " + largestDigit);



        // Program to Calculate the Sum of the Squares of Digits of a Number
        int number6 = 234;
        int sum6 = 0;
        while (number6 != 0) {
            int digit = number6 % 10;
            sum6 += digit * digit;
            number6 /= 10;
        }
        System.out.println("Sum of squares of digits: " + sum6);


        //  Program to Count the Number of Even Digits in a Number
        int number7 = 123456;
        int count = 0;
        while (number7 != 0) {
            int digit = number7 % 10;
            if (digit % 2 == 0) {
                count++;
            }
            number7 /= 10;
        }
        System.out.println("Number of even digits: " + count);


        // Program to Calculate the Sum of Cubes of Digits of a Number
        int number8 = 123;
        int sum8 = 0;
        while (number8 != 0) {
            int digit = number8 % 10;
            sum8 += digit * digit * digit;
            number8 /= 10;
        }
        System.out.println("Sum of cubes of digits: " + sum8);


        // Program to Find the Smallest Digit in a Number
        int number9 = 572839;
        int smallestDigit = 9;
        while (number9 != 0) {
            int digit = number9 % 10;
            if (digit < smallestDigit) {
                smallestDigit = digit;
            }
            number9 /= 10;
        }
        System.out.println("Smallest digit: " + smallestDigit);


        // Program to Count the Number of Odd Digits in a Number
        int num = 123456;
        int count4 = 0;
        while (num != 0) {
            int digit = num % 10;
            if (digit % 2 != 0) {
                count4++;
            }
            num /= 10;
        }
        System.out.println("Number of odd digits: " + count4);



        // Program to Calculate the Factorial of a Number
        int num1 = 6;
        int fact1 = 1;
        int i5 = 1;
        while (i5 <= num1) {
            fact1 *= i5;
            i5++;
        }
        System.out.println("Factorial of " + num1 + " is: " + fact1);



        // Program to Check if a Number is a Palindrome or not
        int num2 = 121;
        int originalNumber = num2;
        int reverse1 = 0;
        while (num2 != 0) {
            int digit = num2 % 10;
            reverse1 = reverse1 * 10 + digit;
            num2 /= 10;
        }
        if (originalNumber == reverse1) {
            System.out.println(originalNumber + " is a palindrome");
        } else {
            System.out.println(originalNumber + " is not a palindrome");
        }


        // Program to Print All Factors of a Number
        int num3 = 36;
        int i6 = 1;
        System.out.print("Factors of " + num3 + ": ");
        while (i6 <= num3) {
            if (num3 % i6 == 0) {
                System.out.print(i6 + " ");
            }
            i6++;
        }


        int product = 1;
        int i7 = 2;
        while (i7 <= 10) {
            product *= i7;
            i7 += 2;
        }
        System.out.println("Product of all even numbers between 1 and 10: " + product);



        // Program to Check if a Number is an Armstrong Number
        int n = 153;
        int originalNumber1 = n;
        int result1 = 0;
        while (n!= 0) {
            int digit = n % 10;
            result1 += digit * digit * digit;
            n /= 10;
        }
        if (result1 == originalNumber1) {
            System.out.println(originalNumber1 + " is an Armstrong number");
        } else {
            System.out.println(originalNumber1 + " is not an Armstrong number");
        }


        //divisble by 3 not 5
        int i11 = 1;
        while (i11 <= 50) {
            if (i11 % 3 == 0 && i11 % 5 != 0) {
                System.out.println(i11);
            }
            i11++;
        }


        //Strong number or not
        int n1=145;
        int sum2=0;
        int x=n1;
        while(n1!=0)
        {
            int d=n%10;
            int fact2=1;
            for(int s=1; s<=d; s++)
            {
                fact2=fact2*s;
            }
            sum2=sum2+fact2;
            n1=n1/10;

        }
        if(x==sum2)
        {
            System.out.println("Strong number");
        }
        else
        {
            System.out.println("Not Strong Number");
        }



        //Least digit
        int m=274189;
        int least=9;
        while(m!=0)
        {
            int d=m%10;
            if(d<least)
            {
                least=d;
            }
            m=m/10;
        }
        System.out.println(least);




        int o=6251;
        int count5=0;
        while(o!=0)
        {
            o=o/10;
            count5++;
        }
        System.out.println(count5);



        //largest number
        int k=2353738;
        int large=0;
        while(k!=0)
        {
            int d=k%10;
            if(d>large)
            {
                large=d;
            }
            k=k/10;
        }
        System.out.println(large);




        // count 0 digits
        int n3=12340120;
        int count6=0,r;
        while(n3!=0)
        {
            r=n3%10;
            if(r==0)
            {
                count6++;
            }
            n3=n3/10;
        }
        System.out.println(count6);


        //Display the first digit
        int n4=12345;
        while(n4<=10)
        {
            n4=n4/10;
        }
        System.out.println(n4%10);


        //sum of first and last numbers
        int n8=12345;
        int first=n8%10;
        n8=n8/10;
        while(n8>=10)
        {
            n8=n8/10;
        }
        int last=n8%10;
        System.out.println(first+last);


    }
}
