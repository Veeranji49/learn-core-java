package operators.basic_operators;


public class Operators {
    public static void main(String[] args) {
        arithmeticOperators();

        Operators main = new Operators();
        main.relationalOperators(12, 16);
        main.conditionalOperators(5, 10);

        unaryOperators(4, 6);

        main.assignmentOperators();
    }

    // Arithmetic Operators :
    public static void arithmeticOperators() {
        int a = 9, b = 3;
        System.out.println("Arithemetic Operators :");
        System.err.println("Value of a :" + a + " ," + "Value of b :" + b);
        System.out.println("Addition :" + (a + b));
        System.out.println("Substraction :" + (a - b));
        System.out.println("Multiplication :" + (a * b));
        System.out.println("Division :" + (a / b));
        System.out.println("Modulus :" + (a % b));
        System.out.println();
    }

    // Relational Operators :
    public void relationalOperators(int x, int y) {
        System.out.println("Relational Operators :");
        System.out.println(x == y); // false
        System.out.println(x != y);// true
        System.out.println(x < y);// true
        System.out.println(x > y);// false
        System.out.println(x <= y);// true
        System.out.println(x >= y);// false
        System.out.println();
    }

    // Conditional Operators :
    public void conditionalOperators(int a, int b) {
        System.out.println("Conditional Operators :");
        System.out.println(a == b && b == a);// false
        System.out.println(b <= a && a <= b);// false
        System.out.println(a != b || b != a);// true
        System.out.println(a == b || b != a);// true
        System.out.println();
    }

    // Unary Operators :
    public static void unaryOperators(long u, long v) {
        System.out.println("Unary Operator :");
        // increment operator & decrement operator
        // System.out.println(--v);//5
        // System.out.println(--u);//3
        // System.out.println(v--);//5
        // System.out.println(u--);//3
        // System.out.println(++v);//5
        // System.out.println(v++);//5
        // System.out.println(++u);//3
        // System.out.println(u++);//3
        System.out.println(--v < u--);// false
        long x = v-- - (v++ + u--) - (u++ + --u);
        System.out.println(x);//
        System.out.println();
    }

    // Assignment Operators :
    public void assignmentOperators() {
        int a = 10, b = 20;
        System.out.println("Assignment Operators :");
        // System.out.println(a==b);//false
        // System.out.println(a+=b);//a=a+b => 30
        // System.out.println(a-=b);//a=a-b =>-10
        // System.out.println(b+=b);//40
        // System.out.println(a-=a);//0
        // System.out.println(a=a*b);//200
        // System.out.println(b/=a);//2
        System.out.println(b %= a);// 0
    }
}