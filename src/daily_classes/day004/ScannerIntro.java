package daily_classes.day004;

import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {

        // I want to save users input after asking some questions
        // and I want to save this input so I can do something with it

        // Step 1 :  Use Scanner class to create scanner object
            // that have this functionality
            Scanner input = new Scanner(System.in);

        // ask user to enter first name
            System.out.print("What is your first Name? ");

        // capture what the user typed into the console
            String firstName = input.next();

                System.out.print("What is your Last Name? ");

                input = new Scanner(System.in);

                String lastName = input.next();

        //Print the result of what we saved from user inputs
            System.out.println("Your first name is: " + firstName + "\nYour last name is: " + lastName);

            System.out.println("Hello " + firstName + " " + lastName + " :)");





    }
}
