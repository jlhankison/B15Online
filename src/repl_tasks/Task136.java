package repl_tasks;

import java.util.Scanner;

public class Task136 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO Type your code below:

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 5 && nums[i+1] == 5){
                System.out.println(true);
                break;
            }else if (i == nums.length -2){
                System.out.println(false);
            }
        }
    }
}
