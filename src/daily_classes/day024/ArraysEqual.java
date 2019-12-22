package daily_classes.day024;

import java.util.Arrays;

public class ArraysEqual {

    public static void main(String[] args) {

        int[] scores1 = {2,5,6,7,3,45,2};
        int[] scores2 = {22,54,6,17,3,45,21};
        int[] scores3 = {2,5,6,7,3,45,2};

        System.out.println(Arrays.equals(scores1,scores3));

    }
}
