package daily_classes.day025;

import java.util.Arrays;
import java.util.Scanner;

public class CastingStringToArray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name = scan.next();

        char[] nameChars = new char[name.length()];

        for (int i = 0; i < nameChars.length; i++) {
            nameChars[i] = name.charAt(i);
        }
        System.out.println(Arrays.toString(nameChars)) ;
    }
}
