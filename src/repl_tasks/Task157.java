package repl_tasks;

import java.util.Scanner;

public class Task157 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
    }

    public static void timeConversion(String s) {
        /*
         * Write your code here.
         */
        String hour = s.substring(0, s.indexOf(":")),
                amPM = s.substring(s.length()-2);
        int hourStandard = Integer.parseInt(hour),
                hourMilitary = 12;

        if (hourStandard==12 && amPM.equals("AM")){
            s = s.replace(hour, "00");
        }else if( amPM.equals("PM") && !hour.equals("12")){
            hourStandard += hourMilitary;
            s = s.replace(hour, Integer.toString(hourStandard));
        }
        System.out.println(s);

    }
}
