package repl_tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task133b {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int decimal = input.nextInt();
        int[] binary = new int[8];

        //TODO: Write your code below.

        int max = 128;

        for (int i = 0; i < binary.length; i++) {
            if(decimal >= max){
                binary[i] ++;
                decimal = decimal - max;
            }
            max = max /2;
        }


        System.out.println(Arrays.toString(binary));
    }
}
