package daily_classes.day032;

public class ArrayPracticeWithMethod {

    public static void arrayPrinter (int [] nums){

        for (int num :
                nums){
            System.out.print(num);
        }

        System.out.println();

    }

    public static void printMaxOfIntArray (int [] nums){
        int maxNum = nums[0];
        for (int num : nums) {
            if (num > maxNum) {
                maxNum = num;
            }
        }
        System.out.println(maxNum);
    }

    public static void printSecondLargestInArray (int [] nums){
        int maxNum = nums[0],
                secMaxNum = nums[0];

        for (int num : nums) {

            if (num > maxNum) {
                maxNum = num;
            } else if (num > secMaxNum && num < maxNum) {
                secMaxNum = num;
            }
        }
        System.out.println(secMaxNum);


    }

    public static void checkAllScoresOver60 (int [] nums){

        boolean allPassed = true;
        for(int num : nums){
            if (num <= 60) {
                System.out.println("Not everyone passed!");
                allPassed = false;
                break;
            }
        }
        if (allPassed){
            System.out.println("Everyone Passed!");
        }
    }

    public static void compare2StringArrayLength (String[] stArr1 , String[] stArr2){

        if(stArr1.length> stArr2.length){
            System.out.println("Array 1 has more items");
        }else if (stArr1.length < stArr2.length){
            System.out.println("Array 2 has more items");
        }else{
            System.out.println("Both arrays have the same number of arrays");
        }
    }


    public static void main(String[] args) {

        int[] nums = {34, 3, 1, 343,6,8,43};
        int[] nums2 = {189, 334,696,123,64};

        arrayPrinter(nums);

        printSecondLargestInArray(nums);

        printMaxOfIntArray(nums);

        checkAllScoresOver60(nums2);
    }
}
