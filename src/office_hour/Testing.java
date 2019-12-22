package office_hour;

import java.util.Arrays;

public class Testing {
    public static void main(String[] args) {

        int [] nums = new int[] {4,3,6,8,21,15,19,1,2,45,8,10,110,88,1};
        int iterations = 0;

        for (int j = 0 ; j < nums.length-1; j++){
            for (int i = 0 ; i < nums.length-1; i++){
                iterations ++;
                if (nums[i]>nums[i+1]) {
                    nums[i]   = nums[i] + nums[i + 1];
                    nums[i+1] = nums[i] - nums[i + 1];
                    nums[i]   = nums[i] - nums[i + 1];
                }
            }
        }
        System.out.println("nums = " + Arrays.toString(nums));
        System.out.println("iterations = " + iterations);
    }
}
