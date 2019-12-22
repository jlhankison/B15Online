package daily_classes.day005;

import java.util.Scanner;

public class DayToMinuteConverter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("How many days do you want to convert? ");

            int days = scan.nextInt();

            int minutes = days * 24 * 60;

        System.out.println(days + " Days = " + minutes + " Minutes.");




    }
}
