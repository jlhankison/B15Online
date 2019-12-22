package daily_classes.day026;


import java.util.Arrays;

public class MoreThan100Test {

    public static void main(String[] args) {

        int[] nums = {18, 23, 424, 8228, 33, 0, -1834, 384, 19, 5};
        int indexCount = 0,
                greaterIndex = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] > 100){
                indexCount ++;
            }
        }

        int [] greaters = new int [indexCount];
        for (int num : nums) {
            if (num > 100) {
                greaters[greaterIndex] = num;
                greaterIndex++;
            }

        }

        System.out.println(Arrays.toString(greaters));



    }
}
