package repl_tasks;

import java.util.Scanner;

public class Task121 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: Write your code below
        int numCounter = 0;
        for (int num:
             nums) {
            if ( num % 2 == 0  ){
                numCounter ++;
            }
        }
        System.out.println(numCounter);

    }
}
