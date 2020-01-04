package repl_tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task141 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i =0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE

        int[] nums2 = new int [size * 2];

        nums2[nums2.length-1] = nums[nums.length-1];

        System.out.println(Arrays.toString(nums2));
    }
}
