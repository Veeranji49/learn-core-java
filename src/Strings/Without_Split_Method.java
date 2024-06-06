package Strings;

public class Without_Split_Method {

    public static void main(String[] args) {
        String s = "This is core java test";
        int count = 0;
        for (int i = 0; i <= s.length() - 1; i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println(s);
        System.out.println(count);
    }
}
