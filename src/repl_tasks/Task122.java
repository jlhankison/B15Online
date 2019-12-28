package repl_tasks;


import java.util.Scanner;

public class Task122 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: write your code below

        int[] counter = new int[nums.length];
//        int singleInt = nums[0];
//        boolean breakOut = false;

//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//
//
//                if (j == nums.length-1) {
//                    singleInt = nums[i];
//                    breakOut = true;
//                }else if ( i == j){
//                    continue;
//                }else if ( nums[i] == nums[j]){
//                    break;
//                }
//
//            }
//            if (breakOut){
//                break;
//            }
//        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    counter[i]++;
                }
            }
        }
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] == 1){
                System.out.println(nums[i]);
            }

        }


    }
}
