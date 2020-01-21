package daily_classes.day043;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WarmUpTasks {

    public static void main(String[] args) {

        Coffee cuppa = new Coffee("Americano", 2, 0);

        System.out.println(cuppa);

        System.out.println(cuppa.getPrice());
        System.out.println(cuppa.getType());
        System.out.println(cuppa.getCaffeineLevel());

        StarbucksUtil.printCoffeeInfo(cuppa);

        ArrayList<Coffee> cups = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            cups.add(new Coffee());
        }




        //any non-primitive type can be assigned to null
        String str = null;
        Scanner scan = null;
        Coffee cx = null;

        List<String> lst = new ArrayList<>();
        lst.add("abc");
        lst.add(null);
        lst.add(null);

        System.out.println(lst);


        List<Integer> lst2 = new ArrayList<>(5);

        System.out.println(lst2);
    }
}
