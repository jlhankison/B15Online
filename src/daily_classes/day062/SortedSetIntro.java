package daily_classes.day062;

import java.util.*;

public class SortedSetIntro {

    public static void main(String[] args) {


        SortedSet<Integer> mySet = new TreeSet<>();

        mySet.add(10);
        mySet.add(10);
        mySet.add(11);
        mySet.add(20);
        mySet.add(1);
        mySet.add(110);
        mySet.add(18);
        mySet.add(94);
        mySet.add(66);
        mySet.add(20);

        System.out.println("mySet = " + mySet);

        System.out.println("mySet.first() = " + mySet.first());
        System.out.println("mySet.last() = " + mySet.last());

//      ---------------------------------------------------------

        SortedSet<String> States = new TreeSet<>();

        States.addAll(Arrays.asList("Alaska", "Arkansas", "Hawaii", "Texas", "Wisconsin", "Arkansas", "Oregon", "Alaska"));

        System.out.println("States = " + States);


    }
}
