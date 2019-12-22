package daily_classes.day029;

import java.util.Arrays;

public class FillingArrayWithFor {

    public static void main(String[] args) {

        int[] nums = new int [100];

        System.out.println("before filled:");
        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length; i++) {

            nums[i] = 1 + (i * 2);

        }
        System.out.println("after filled:");
        System.out.println(Arrays.toString(nums));
    }
}
