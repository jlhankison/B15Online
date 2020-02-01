package daily_classes.day051;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practice {

    public static void main(String[] args) {

        List<String> lst = new ArrayList<>();
        lst.add("ABC");

        List<Integer> lst2 = new ArrayList<>();
        lst2.add(12);
        lst2.add(3);
        lst2.add(2);
        lst2.add(91);
        lst2.add(0);
        lst2.add(-873);

        Collections.sort(lst2);

        System.out.println("lst2 = " + lst2);


        Animal a1 = new Dog();

        a1.makeAnimalNoise();

        a1 = new Horse();

        a1.makeAnimalNoise();
        
    }
}
