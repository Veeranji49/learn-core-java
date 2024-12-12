package strings;

public class Sum_Of_Digits_in_String {
    public static void main(String[] args) {

        String s = "fslkjldf2439sfdjk%&%$&";
        int sum = 0;
        for (int i = 0; i <= s.length() - 1; i++) {
            char x = s.charAt(i);
            if (x >= '0' && x <= '9') {
                int y = x - 48;
                sum = sum + y;
            }
        }
        System.out.println("Sum of digits :" + sum);
    }
}
