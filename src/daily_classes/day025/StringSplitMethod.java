package daily_classes.day025;

import java.util.Arrays;

public class StringSplitMethod {

    public static void main(String[] args) {

        String sentence = "Everything is awesome!!";

        String[] splitBy_is_Array = sentence.split("is");

        System.out.println(Arrays.toString(splitBy_is_Array));
    }
}
