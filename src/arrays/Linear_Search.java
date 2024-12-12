package arrays;

public class Linear_Search {

    public static void main(String[] args) {

        //Finding the linear search of an array element

        int[] arr = {9, 1, 4, 2, 5, 2, 7, 5, 8, 6, 3, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        boolean found = false;
        int ele = 5;

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == ele) {
                System.out.println("Found location:" + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Not found");
        }
    }
}
