package daily_classes.day062;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StateSet2 {

    public static void main(String[] args) {

        Set<String> States = new HashSet<>();

        States.addAll(Arrays.asList("Alaska", "Arkansas", "Hawaii", "Texas", "Wisconsin", "Arkansas", "Oregon", "Alaska"));

        System.out.println("States = " + States);

        // Iterator removal method
        Iterator<String> iteratorStates = States.iterator();

        while (iteratorStates.hasNext()){

            String each = iteratorStates.next();
            if(each.contains("A")){
                iteratorStates.remove();
            }
            System.out.println(iteratorStates.next());
        }

        // Collections removeIf method
        States.removeIf(each-> each.contains("A"));

        System.out.println("States = " + States);
    }
}
