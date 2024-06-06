package Strings;

public class Highest_digit_in_a_String {
    public static void main(String[] args) {

        String s = "veeranji12345629252";
        int highest = 0;
        for (int i = 0; i <= s.length() - 1; i++) {
            char y = s.charAt(i);
            if (y >= '0' && y <= '9') {
                int x = y - 48;
                if (x > highest) {
                    highest = x;
                }
            }
        }
        System.out.println("Highest digit :" + highest);
    }
}
