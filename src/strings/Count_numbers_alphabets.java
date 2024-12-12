package strings;

public class Count_numbers_alphabets {
    public static void main(String[] args) {
        String s = "veeranjijlkr49@gmail.com";
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (int i = 0; i <= s.length() - 1; i++) {
            char y = s.charAt(i);
            if (y >= 'a' && y <= 'z' || y >= 'A' && y <= 'Z') {
                count1++;
            } else if (y >= '0' && y <= '9') {
                count2++;
            } else {
                count3++;
            }
        }
        System.out.println("Alphabets :" + count1);
        System.out.println("Numbers :" + count2);
        System.out.println("Othes :" + count3);
    }
}
