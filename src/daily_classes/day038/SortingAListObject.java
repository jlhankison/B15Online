package daily_classes.day038;

import java.util.*;

public class SortingAListObject {

    public static void main(String[] args) {


        List<Integer> nums3 = new ArrayList<>(Arrays.asList(123, 3000, 100, 125, 2821));

        System.out.println("nums3 before sort = " + nums3);

        Collections.sort(nums3);
        //collections utility class is a class coming from the java.util package
        //collections has a ton of methods to do things to ArrayLists!
        //



        Collections.sort(nums3, Comparator.reverseOrder());

        System.out.println("nums3 after sort = " + nums3);
    }
}
