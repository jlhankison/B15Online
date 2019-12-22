package daily_classes.day024;

import java.util.Arrays;

public class ArraysMethodSorting {

    public static void main(String[] args) {

        int[] scores = { 99,44,66,23,19,55};

        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));

        boolean[] test = {true, false, false, true, false, false, true, true};

        //Arrays.sort(test);

    }
}
