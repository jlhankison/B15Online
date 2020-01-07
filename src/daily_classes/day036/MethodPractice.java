package daily_classes.day036;

import java.util.Arrays;

public class MethodPractice {

    public static void main(String[] args) {

        System.out.println(checkStringForNum("I am so tired!"));

        long[] nums = { 23, 8593, 93039123, 31, 435343};
        System.out.println(Arrays.toString(nums));
        swapFirstLastIndex(nums);
        System.out.println(Arrays.toString(nums));



        Integer x = null; //<-- Integer objects can store a null point
        // int x = null; <-- impossible because int is primitive data


    }


    /**
     * checkStringForNum checks through a string.
     *
     * @param str type String. String that will be checked for any numbers
     * @return true if the String Contains at least one number
     */
    public static Boolean checkStringForNum (String str){

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                return Boolean.valueOf(true);
            }
        }
        return Boolean.valueOf(false);
    }

    /**
     * Swaps first and last index values within a long Array.
     * value of longArry passes directly to the original object
     * @param longArry type long Array: array that will be swapping first and last indexes
     */
    public static void swapFirstLastIndex (long[] longArry){

        long temp = longArry[0];
        int lastIndex = longArry.length-1;

        longArry[0] = longArry[lastIndex];
        longArry[lastIndex]= temp;

    }
}
