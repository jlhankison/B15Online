package daily_classes.day025;

public class IsArraySortedManual {

    public static void main(String[] args) {

        int[] nums = {13, 31, 8,5, 21,2};

        boolean sorted;

 //       Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            sorted = true;
            if (nums[i]> nums[i+1]){
                sorted = false;
                System.out.println("array is not sorted!");
                break;
            }

        }
    }
}
