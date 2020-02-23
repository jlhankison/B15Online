package daily_classes.day063;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetPractice {

    public static void main(String[] args) {


        String str = "The new link for joining class bla bla bla";

        Set<Character> charSet = new LinkedHashSet<>();

        for (int i = 0; i < str.length(); i++) {
            charSet.add(str.charAt(i));
        }

        System.out.println("str.length() = " + str.length());

        System.out.println("charSet.size() = " + charSet.size());

        for (Character each : charSet) {
            System.out.println(each);
        }
    }
}
