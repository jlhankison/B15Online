package daily_classes.day036;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {

    public static void main(String[] args) {

        List<Long> lst = new ArrayList<>();

//        C.R.U.D.
//          Create, Read, Update, Delete
        //add item, read item, update the item, remove the item, check the location

        lst.add(32L);
        lst.add(18239L);
        lst.add(93L);

        System.out.println(lst);
        Long sum = 0L;

        for (int i = 0; i < lst.size(); i++) {
            sum += lst.get(i);
        }
        System.out.println(sum);
    }
}
