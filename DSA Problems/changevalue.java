

import java.util.Arrays;


public class changevalue {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void change(int[] nums) {
        nums[0] = 99; // here both nums and arr are pointing  to same value in heap memory;
    }
}
