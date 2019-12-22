package daily_classes.day025;

import java.util.Arrays;

public class ManualSort {
    public static void main(String[] args) {

        int [] nums = new int[] {4,3,6,8,21,15,19,1,2,45,8,10,110,88,1};
        int placeHolder = 0;
//                iterations = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
//                iterations ++;
                if (nums[i] > nums[j]){
                    placeHolder = nums[i];
                    nums[i] = nums[j];
                    nums[j] = placeHolder;
                }
            }
        }
        System.out.println("nums = " + Arrays.toString(nums));
//        System.out.println("iterations = " + iterations);
    }
}
