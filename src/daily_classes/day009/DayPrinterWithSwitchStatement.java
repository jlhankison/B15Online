package daily_classes.day009;

import java.util.Scanner;

public class DayPrinterWithSwitchStatement {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String dayName;

        System.out.println("What is the day code?");
        int dayCode = scan.nextInt();


        switch (dayCode){

            case 1 :
                dayName = "Monday";
                break; // <-- This is used to get out of this branch in a switch statement

            case 2 :
                dayName = "Tuesday";
                break;

            case 3 :
                dayName = "Wednesday";
                break;

            case 4 :
                dayName = "Thursday";
                break;
            case 5 :
                dayName = "Friday";
                break;
            case 6 :
                dayName = "Saturday";
                break;

            case 7 :
                dayName = "Sunday";
                break;

            default:
                dayName = "Unknown";
        }

        System.out.println("Day is: " + dayName);

    }
}
