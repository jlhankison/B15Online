package daily_classes.day026;

import java.util.Arrays;
import java.util.Scanner;

public class ReversingArray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] example = new int[7];
        int temp,
                lastIndex = example.length-1;

        for (int i = 0; i < example.length; i++) {
            System.out.println("please enter number " + (i+1));
            example[i] = scan.nextInt();
        }

        System.out.println(Arrays.toString(example));

        for (int i = 0; i <= lastIndex / 2; i++) {
            temp = example[i];
            example[i] = example[lastIndex-i];
            example[lastIndex-i] = temp;
        }

        System.out.println(Arrays.toString(example));


    }
}
