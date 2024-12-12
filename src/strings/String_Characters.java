package strings;

public class String_Characters {

    public static void main(String[] args) {

        String s = "(){}[](){}[]";
        boolean valid = true;

        if (s.length() % 2 == 0) {
            char c1 = '(', c2 = ')', c3 = '{', c4 = '}', c5 = '[', c6 = ']';
            for (int i = 0; i <= s.length() - 1; i = i + 2) {
                char ch1 = s.charAt(i);
                char ch2 = s.charAt(i + 1);
                if (ch1 == c1 && ch2 == c2) {
                    continue;
                } else if (ch1 == c3 && ch2 == c4) {
                    continue;
                } else if (ch1 == c5 && ch2 == c6) {
                    continue;
                } else {
                    valid = true;
                    break;
                }
            }
        } else {
            valid = false;
        }

        System.out.println(valid);

    }

}
