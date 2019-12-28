package repl_tasks;

import java.util.Arrays;

public class Task129 {
    public static void main(String[] args) {

        System.out.println("-----EXAMPLE RUN ---------");
        String[] numbers = {"zero", "one", "two","three","four"};
        System.out.println(Arrays.toString(getWithE(numbers)));

    }



    public static String[] getWithE(String[] arr) {

        //TODO : YOUR CODE GOES HERE ----------------------
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("e")){
                count ++;
            }
        }
        String[] strE = new String [count];
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("e")){
                strE[x] = arr[i];
                x ++;
            }

        }
        return strE;
    }
}
