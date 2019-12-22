package daily_classes.day008;

import java.util.Scanner;

public class JustIfStatement {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What's your current speed?");

        int currentSpeed = scan.nextInt();

        System.out.println("What is the speed limit?");
        int speedLimit = scan.nextInt();

        if (currentSpeed>= speedLimit){

            System.out.println("get pulled over by the police");
            System.out.println("given ticket");
            System.out.println("points taken away from your license");
            System.out.println("go to court");

        } // THERE IS NO ELSE, PROGRAM JUST MOVES ON

        System.out.println("THE END OF THE STORY, MOVE ON");





    }
}
