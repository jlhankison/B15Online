package repl_tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task133{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int decimal = input.nextInt();
        int[] binary = new int[8];

        //TODO: Write your code below.

        int binaryDigit = 128;

        for (int i = 0; i < binary.length ; i++) {
            if (binaryDigit <= decimal ){
                decimal -= binaryDigit;
                binary[i] ++;
            }else if ( decimal ==0){
                break;
            }
            binaryDigit /=2;
        }
        System.out.println(Arrays.toString(binary));
    }
}
