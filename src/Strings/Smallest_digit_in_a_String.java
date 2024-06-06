package Strings;

public class Smallest_digit_in_a_String {

    public static void main(String[] args) {

        String s = "fsd2347923498273sdfsdkjlf";
        int small = s.length();

        for (int i = 0; i < s.length() - 1; i++) {

            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                int y = ch - 48;
                if (y < small) {
                    small = y;
                }
            }
        }
        System.out.println("smallest digit :" + small);
    }
}
