package repl_tasks;

import java.util.Scanner;

public class Task152 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }

        plus_minus(arr);
    }//end main

    public static void plus_minus(int[] arr){
        int positive = 0,
                negative = 0,
                zero = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
                positive ++;
            }else if(arr[i]<0){
                negative ++;
            }else{
                zero ++;
            }

        }
        System.out.print("positives:" + positive);
        System.out.print("negative:" + negative);
        System.out.print("zeros:" + zero);

    }
}
