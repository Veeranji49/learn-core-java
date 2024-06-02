package basic_programs;

public class Swap_2_numbers_without_3rd_variable {
    public static void main(String[] args) {

        int a = 4, b = 6;
        System.out.println("Before swap:" + a + "," + b);
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println("After Swap:" + a + "," + b);
    }
}
