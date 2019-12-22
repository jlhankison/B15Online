package daily_classes.day017;

import java.util.Scanner;

public class CommonDenominator_789 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean repeat = true;
        String isDoneFinder = "";


        while (repeat) {

            System.out.println("Enter 3 numbers to see what their common denominators are");
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();
            int num3 = scan.nextInt();

            int counter = 0;

            while (counter < 10000) {
                if (counter % num1 == 0 && counter % num2 == 0 && counter % num3 == 0) {
                    System.out.println("counter = " + counter + " <--divisible by " + num1 + ", " + num2
                            + ", and " + num3);
                }
                ++counter;
            }

            System.out.println("Would you like to run again?");
            isDoneFinder = scan.next();
            if(isDoneFinder.equalsIgnoreCase("no") || isDoneFinder.equalsIgnoreCase("n")){
                repeat = false;
            }

        }

        System.out.println("Thank you for using Common Denominator program");
    }
}
