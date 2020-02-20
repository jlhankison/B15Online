package daily_classes.day062;


import java.util.*;

public class StateSet {

    public static void main(String[] args) {



        Set<String> States = new HashSet<>();

        States.addAll(Arrays.asList("Alaska", "Arkansas", "Hawaii", "Texas", "Wisconsin", "Arkansas", "Oregon", "Alaska"));

        System.out.println("States = " + States);

        //ForEach loop expression
        for (String each : States) {
            System.out.println(each);
        }

        //Iterator expression
        Iterator<String> stateIterator = States.iterator();

        while (stateIterator.hasNext()) {

            System.out.println(stateIterator.next());
        }

        //Lamba expression
        States.forEach(System.out::print);
    }
}
