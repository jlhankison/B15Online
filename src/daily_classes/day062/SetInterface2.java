package daily_classes.day062;

import java.util.*;

public class SetInterface2 {

    public static void main(String[] args) {
        // Creating a HashSet with items already inside

        List<Integer> numList = Arrays.asList(10,10,20,20,20,30,30,30,30);

        System.out.println("numList = " + numList);

        Set<Integer> myNums = new HashSet<>(numList);

        System.out.println("myNums = " + myNums);


    }


}
