package strings;

public class Alphabets_in_the_String {
    public static void main(String[] args) {
        String s = "Jilakara 54350 %$*&@! Veeranji";

        for (int i = 0; i <= s.length() - 1; i++) {
            char y = s.charAt(i);
            if (y >= 'a' && y <= 'z' || y >= 'A' && y <= 'Z') {
                System.out.println("Alphabets :" + y);
            }
        }
    }
}
