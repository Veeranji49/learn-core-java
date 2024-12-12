package strings;

public class Char_is_Vowel_or_Not {

    public static void main(String[] args) {

        String s = "afjkruwezxm@#&%860447116";
        for (int i = 0; i <= s.length() - 1; i++) {
            char y = s.charAt(i);
            if (y == 'a' || y == 'e' || y == 'i' || y == 'o' || y == 'u') {
                System.out.println(y);
            }
        }
    }
}
