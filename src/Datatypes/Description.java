package Datatypes;

public class Description {

    public static void main(String[] args) {


/*
    ////  Primitive Data Types  ////

   1) byte:

    Size: 8-bit
    Range: -128 to 127
    Example: byte b = 100;


    2) short:

    Size: 16-bit
    Range: -32,768 to 32,767
    Example: short s = 1000;



    3) int:

    Size: 32-bit
    Range: -2^31 to 2^31-1
    Example: int i = 100000;



    4) long:

    Size: 64-bit
    Range: -2^63 to 2^63-1
    Example: long l = 100000L;



    5) float:

    Size: 32-bit IEEE 754 floating point
    Range: approximately ±3.40282347E+38F
    Example: float f = 10.5f;



    6) double:

    Size: 64-bit IEEE 754 floating point
    Range: approximately ±1.79769313486231570E+308
    Example: double d = 10.5;


    7) boolean:

    Size: 1-bit
    Values: true or false
    Example: boolean flag = true;



    8) char:

    Size: 16-bit Unicode character
    Range: '\u0000' (0) to '\uffff' (65,535)
    Example: char letter = 'A';



  /////     Reference/Object Data Types   ////

    1) Classes:

        Example: String str = "Hello";


    2) Interfaces:

        Example: Runnable runnable = new Runnable() { ... };


    3)Arrays:

        Example: int[] arr = new int[10];


 */


        // Primitive data types
        byte byteVar = 100;
        short shortVar = 1000;
        int intVar = 100000;
        long longVar = 100000L;
        float floatVar = 10.5f;
        double doubleVar = 10.5;
        boolean booleanVar = true;
        char charVar = 'A';

        // Reference data types
        String stringVar = "Hello, World!";
        int[] arrayVar = {1, 2, 3, 4, 5};

        System.out.println("byte: " + byteVar);
        System.out.println("short: " + shortVar);
        System.out.println("int: " + intVar);
        System.out.println("long: " + longVar);
        System.out.println("float: " + floatVar);
        System.out.println("double: " + doubleVar);
        System.out.println("boolean: " + booleanVar);
        System.out.println("char: " + charVar);
        System.out.println("String: " + stringVar);
        System.out.print("Array: ");
        for (int i : arrayVar) {
            System.out.print(i + " ");
        }

    }
}
