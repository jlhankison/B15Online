package daily_classes.day005;

import java.util.Scanner;

public class ScannerPractice {

    public static void main(String [] args){

        int currentYear = 2019;
        Scanner userInput = new Scanner(System.in);


        System.out.print("What is your name? ");

            String name = userInput.next();


        System.out.print("What is your birth year? ");

            int birthYear = userInput.nextInt();
            int age = currentYear - birthYear;

        System.out.print("How tall are you? ");

            Double height = userInput.nextDouble();

        System.out.println("You're name is: " + name + "\nYour age is: " + age + "\nYou are "
                + height + " feet tall.");



    }
}
