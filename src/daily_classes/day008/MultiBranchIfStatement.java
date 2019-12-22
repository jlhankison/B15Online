package daily_classes.day008;

import java.util.Scanner;

public class MultiBranchIfStatement {

    public static void main(String[] args) {

        // pseudo code
        /*
        declare your currentSpeed, speedLimit

        check weather the current speed is

            more than 90 --> Jail
            more than 80 and less than 90 --> reckless driving
            more than 70 and less than 80 --> points taken off your license
            more than 60 and less than 70 --> warning

        if not speeding --> keep driving

         */
        Scanner scan = new Scanner(System.in);

        int speedLimit = 60;

        System.out.println("What is your current speed?");
        int currentSpeed = scan.nextInt();

        if (currentSpeed > 90 ){
            System.out.println("Your speed: " + currentSpeed);
            System.out.println("Speed limit: " + speedLimit);
            System.out.println("You are going faster than 90!\nYou're going to jail");

        //Asking here  whether it's less than or equal to 90 and more than 80
            //When you come to this point YOU ALREADY KNOW THAT THE SPEED IS <= 90 YOU DONT NEED TO CHECK TWICE
        }else if (currentSpeed > 80) {
            System.out.println("Speed limit: " + speedLimit);
            System.out.println("Your speed: " + currentSpeed);
            System.out.println("Your speed was less than or equal to 90 but more than 80.\nYou are being ticketed for reckless driving.");

        }else if (currentSpeed > 70) {
            System.out.println("Speed limit: " + speedLimit);
            System.out.println("Your speed: " + currentSpeed);
            System.out.println("Your speed was less than or equal to 80 but more than 70.\nYou are losing some points off your license.");

        }else if (currentSpeed > 60) {
            System.out.println("Your speed: " + currentSpeed);
            System.out.println("Speed limit: " + speedLimit);
            System.out.println("Your speed was less than or equal to 70 but more than 60.\nI'll let you off with a warning");

        }else {
            System.out.println("Your speed: " + currentSpeed);
            System.out.println("Speed limit: " + speedLimit);
            System.out.println("You are driving less than or equal to 60.\nYOU AREN'T SPEEDING.");
        }
    }
}
