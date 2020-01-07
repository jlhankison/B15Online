package daily_classes.day036;

import java.util.ArrayList;

public class ArrayListCheckForUnique {

    public static void main(String[] args) {

        int[]nums = {33, 22, 11, 55, 33, 55,22, 99, 22, 55};
        ArrayList<Integer> intList = new ArrayList<>();

        for (int each : nums){
            if (! intList.contains(each)){
                intList.add(each);
            }
        }
        System.out.println(intList);
    }
}
