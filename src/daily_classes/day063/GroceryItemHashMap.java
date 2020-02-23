package daily_classes.day063;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class GroceryItemHashMap {

    public static void main(String[] args) {

        Map<String, Double> groceryStrDouPair = new HashMap<>();

        groceryStrDouPair.put("Pineapple", 5.99);
        groceryStrDouPair.put("Grapefruit", 1.32);
        groceryStrDouPair.put("Watermelon", 6.99);
        groceryStrDouPair.put("Tangerine", .99);
        groceryStrDouPair.put("Potatoes", .39);
        groceryStrDouPair.put("Pineapple", 7.99);
        groceryStrDouPair.putIfAbsent("Pineapple", 5.99);

        System.out.println("groceryStrDouPair = " + groceryStrDouPair);

        String str = "The new link for joining class will require you to login to Okta, if it ask you to sign in " +
                ", please just click on it , it will take you too Okta signin page , once you signin with Okta" +
                "Then you will be able to join right away. PLEASE DO NOT TRY TO REGISTER , THE LINK IS ALREADY IN THE EMAIL" +
                "Click to join";

        Map<Character, Integer> characterIntegerMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);

            if (!characterIntegerMap.containsKey(each)){
                characterIntegerMap.put(each, 1);
            }else{
                int x = characterIntegerMap.get(each);
                characterIntegerMap.replace(each, x+1);
            }

        }
        System.out.println("characterIntegerMap = " + characterIntegerMap);

    }
}
