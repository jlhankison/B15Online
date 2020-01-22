package repl_tasks;

import java.util.Arrays;

public class Task190 {

    public static int[] mergR(int[] a,int[] b) {

        int[] merged = new int[a.length + b.length];
        int counter = 0;
        for (int i = 0; i < merged.length; i++) {
            if(i < a.length){
                merged[i] = a[i];
            }else{
                merged[i] = b[counter];
                counter ++;
            }
        }
        return merged;

    }//end mergR

    public static void main(String[] args)
    {
        int[] a = {1,2,3};
        int[] b = {4,5,6};
        System.out.println(Arrays.toString(mergR(a, b)));
    }
}
