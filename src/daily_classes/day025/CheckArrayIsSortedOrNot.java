package daily_classes.day025;

import java.util.Arrays;

public class CheckArrayIsSortedOrNot {

    public static void main(String[] args) {

        int[] nums = {13, 31, 8,5, 21,2};
        int numsLength = nums.length;

        int[] numsCopy = new int[numsLength];

        for (int i = 0; i < numsLength ; i++) {
            numsCopy[i] = nums[i];
        }

        Arrays.sort(numsCopy);

        if (numsCopy.equals(nums)){
            System.out.println("nums array is already sorted!");
        }else{
            System.out.println("nums array is not sorted!");
        }
    }
}
