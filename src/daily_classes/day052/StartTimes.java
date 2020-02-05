package daily_classes.day052;

import daily_classes.day049.Burger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StartTimes {


    public static void main(String[] args) {


        Burger b1 = new Burger("Double Stack");

        List<Time> lst = (Arrays.asList(b1, new Rectangle("bla", 5, 4) ));

        for (Time each :
                lst) {
            each.CreationTimeStamp();
        }
    }
}
