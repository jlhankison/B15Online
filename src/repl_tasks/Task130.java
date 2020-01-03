package repl_tasks;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task130 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE
        int temp = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length -1){
                nums[i] = temp;
                break;
            }
            temp = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = temp;
        }
        System.out.println(Arrays.toString(nums));
    }
}
