package daily_classes.day026;

import java.util.Arrays;

public class SplitPractice {

    public static void main(String[] args) {

        String example = "Get to da choppa!";

        int x = 0;
        char[] charArray = example.toCharArray();

        while (x < charArray.length){
            System.out.print(charArray[x]);
            x++;
        }
        System.out.println();


        int y = 0;
        do{
            System.out.print(charArray[y]);
            y++;
        }while (y < charArray.length);
        System.out.println();

        Arrays.sort(charArray);

        for (char curChar : charArray) {
            System.out.print(curChar);

        }


    }

}

