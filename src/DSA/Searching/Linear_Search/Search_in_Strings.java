package DSA.Searching.Linear_Search;

public class Search_in_Strings {
    public static void main(String[] args) {

        String s = "Jilkara Veeranji";
        char target = 'V';
        boolean ans = linearSearch(s, target);
        System.out.println(ans);
    }

    static boolean linearSearch(String s, char target) {
        if (s.length() == 0) {
            return false;
        }

        for (char i = 0; i <= s.length() - 1; i++) {
            if (target == s.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
