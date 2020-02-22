package daily_classes.day062;

import java.util.*;

public class LinkedHashSetImplementation {

    public static void main(String[] args) {

        Set<Integer> myNums = new LinkedHashSet<>();


        myNums.add(10);
        myNums.add(10);
        myNums.add(11);
        myNums.add(20);
        myNums.add(1);
        myNums.add(110);
        myNums.add(18);
        myNums.add(94);
        myNums.add(66);

        System.out.println("myNums = " + myNums);

        Set<Integer> myNums2 = new HashSet<>();


        myNums2.add(10);
        myNums2.add(10);
        myNums2.add(11);
        myNums2.add(20);
        myNums2.add(1);
        myNums2.add(110);
        myNums2.add(18);
        myNums2.add(94);
        myNums2.add(66);

        System.out.println("myNums2 = " + myNums2);
    }
}
