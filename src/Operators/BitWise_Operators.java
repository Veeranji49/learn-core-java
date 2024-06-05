package Operators;

public class BitWise_Operators {

    public static void main(String[] args) {

        /* These operators are used to perform operations on individual bits of
           integer types.  */


        // Bitwise AND (&)
        int result = 5 & 3; // result is 1
        System.out.println(result);


        //Bitwise OR (|)
        int result1 = 5 | 3; // result is 7
        System.out.println(result1);


        //Bitwise XOR (^)
        int result2 = 5 ^ 3; // result is 6
        System.out.println(result2);


        // Bitwise Complement (~)
        int result3 = ~5; // result is -6
        System.out.println(result3);


        // Left Shift (<<)
        int result4 = 5 << 1; // result is 10
        System.out.println(result4);


        // Right Shift (>>)
        int result5 = 5 >> 1; // result is 2
        System.out.println(result5);


        // Unsigned Right Shift (>>>)
        int result6 = 5 >>> 1; // result is 2
        System.out.println(result6);
    }
}

