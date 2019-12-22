package daily_classes.day024;

import java.util.Arrays;

public class ArraysClassMethod {

    public static void main(String[] args) {

        //create a double array of 3 items; and put 3 values
        //get a string representation out of this array and save it as pricesString
        //print each and every character in this String in this format:
        //char at index 0 is : yourCharacterHere
        //char at index 1 is : yourCharacterHere and so on all the way to the end

        double[] pricesArray = {4.76, 18.23, 95.21};

        String pricesString = Arrays.toString(pricesArray);

        for (int i = 0; i < pricesString.length(); i++) {
            char yourCharacterHere = pricesString.charAt(i);
            System.out.println("" + yourCharacterHere);

        }

    }
}
