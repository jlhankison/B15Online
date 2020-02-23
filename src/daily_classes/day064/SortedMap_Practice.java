package daily_classes.day064;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMap_Practice {

    public static void main(String[] args) {


        SortedMap<String, Double>  groceryPriceMap = new TreeMap<>();

        groceryPriceMap.put("Tomato", 1.55);
        groceryPriceMap.put("Potato", .55);
        groceryPriceMap.put("Pineapple", 5.39);
        groceryPriceMap.put("Grapes", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.95);

        System.out.println("groceryPriceMap = " + groceryPriceMap);
    }
}
