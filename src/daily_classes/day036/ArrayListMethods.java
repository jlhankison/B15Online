package daily_classes.day036;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {

    public static void main(String[] args) {

        ArrayList<Integer> lst = new ArrayList<>();

        lst.add(12);
        lst.add(8353);
        lst.add(1);
        lst.add(22);

        System.out.println(lst);

        lst.add(3, 232);

        System.out.println(lst);

        lst.remove( (Integer) 12);

        System.out.println(lst);

        List<Long> lst2 = new ArrayList<>();

        lst2.add(null);
        lst2.add(null);
        lst2.add(null);
        lst2.add(null);

        System.out.println(lst2.isEmpty());

    }
}
