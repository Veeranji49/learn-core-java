package Arrays;

import java.util.Arrays;

public class Array_ToString_Passing_in_Functions {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(nums));

        num(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void num(int[] arr){
        arr[4] =345;
    }
}
