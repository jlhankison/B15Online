package group_practice;

import java.util.SortedMap;
import java.util.TreeMap;

public class String_MapChallenge {

    /*
     *       given a string of letters, with lots of repeat letters, output the letters in the string, as well as the count of each letter
     *
     *       use a Map.
     *
     *       Key Value pairs
     *
     *       String word = "aaAAbbbCCCCd"
     */

    public static void main(String[] args) {

        String str = "aaAAbbbCCCCd";

        SortedMap<Character, Integer> charSortedMap = new TreeMap();

        for ( int i = 0; i < str.length(); i++ ) {

            Character x = str.charAt(i);

            if (charSortedMap.containsKey(x)) {
                charSortedMap.put(x, charSortedMap.get(x) + 1);
            } else {
                charSortedMap.putIfAbsent(x, 1);
            }

        }

        System.out.println("charSortedMap = " + charSortedMap);

    }
}
