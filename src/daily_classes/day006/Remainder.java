package daily_classes.day006;

import java.util.Scanner;

public class Remainder {

    public static void main(String[] args) {


        //+ - * /

        System.out.println( 5/2); // <-- this operator will divide int or WHOLE NUMBERS

        System.out.println( 5.0/2); // <-- this operator will divide double or fractional number

        System.out.println( 5.0/ 2f);

        System.out.println( 5%2 ); // <-- this operator will give the remainder after you divide a whole number "= 1"

        System.out.println( 97 & 10 ); // remainder here = 7 (10 fits in to 99, 9 times and has a remainder of 7)

        System.out.println( 100 % 10 ); // remainder here = 0 (10 fits into 100, 10 times and has no remainder... so 0)

        //declare a variable called minutes, data type int
//        Print the result in x hour y minutes format
//        for example 135 minutes , = 2 hours 15 minutes

        Scanner userInput = new Scanner(System.in);
        System.out.print("How many minutes: ");

        int totalMinutes = userInput.nextInt();

            int hours = totalMinutes / 60 ;

            int minuteRemainder = totalMinutes % 60;


        System.out.println( totalMinutes + " minutes = " + hours + " Hours " + minuteRemainder +" minutes");


    }
}
