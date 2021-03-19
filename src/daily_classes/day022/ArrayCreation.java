package daily_classes.day022;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayCreation {

    char firstNotRepeatingCharacter(String s) {
        Map<Character, Integer> counts = new HashMap<>(s.length());
        for (char c: s.toCharArray() ) {
//            if counts.
            counts.put(c, counts.get(c) + 1);
        }
        for(char c : s.toCharArray()){
            if (counts.get(c) == 1){
                return c;
            }
        }
        return '_';
    }




    public static void main(String[] args) {

        int[] areaCodes = {715, 212, 608, 703};
        String x = "FUCK YOU JAVA";

        char[] fuckOff = x.toCharArray();
        System.out.println(fuckOff);



    }
}
