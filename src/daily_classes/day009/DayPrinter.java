package daily_classes.day009;

import java.util.Scanner;

public class DayPrinter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is the day code?");
        int dayCode = scan.nextInt();

        String day;

        if (dayCode == 1) {
            day = "Monday";

        } else if (dayCode == 2) {
            day = "Tuesday";

        } else if (dayCode == 3) {
            day = "Wednesday";

        } else if (dayCode == 4) {
            day = "Thursday";

        } else if (dayCode == 5) {
            day = "Friday";

        } else if (dayCode == 6) {
            day = "Saturday";

        } else if (dayCode == 7) {
            day = "Sunday";

        } else {
            day = "Unknown";
        }

        System.out.println("Today is: " + day);

    }
}
