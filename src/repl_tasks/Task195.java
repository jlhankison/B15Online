package repl_tasks;

import java.util.ArrayList;

public class Task195 {

    public static int sum(ArrayList<Integer> ints)
    {
        int sum = 0;
        //write code here
        for (Integer each : ints) {
            sum += each;
        }

        return sum;
    }
}
