package repl_tasks;

import java.util.Scanner;

public class Task159 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i=0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums){
        //WRITE YOUR CODE HERE


        for (int i = 0; i < nums.length; i++) {
            boolean contains = false;
            for (int j = 0; j < nums.length; j++) {
                if (i == j){
                    continue;
                }else if(nums[i] == nums[j]){
                    contains = true;
                    break;
                }
            }
            if(!contains){
                System.out.println(nums[i]);
            }
        }

    }
}
