package Operators;

public class Unary_Operator {

    public static void main(String[] args) {

        //  These operators operate on a single operand.

        // Unary plus (+)
        int num = +5; // num is 5
        System.out.println(num);


        // Unary minus (-)
        int num1 = -5;
        System.out.println(num1);


        // Increment (++)
        int num2 = 5;
        num2++;
        System.out.println(num2);


        // Decrement (--)
        int num3 = 5;
        num3--;
        System.out.println(num3);

        // Logical complement (!)
        boolean flag = true;
        flag = !flag; // flag is false
        System.out.println(flag);

    }
}
