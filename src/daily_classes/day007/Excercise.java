package daily_classes.day007;

import java.util.Scanner;

public class Excercise {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String firstName, lastName, company, email;

        System.out.print("What is your first and last name? ");
        firstName = input.next();
        lastName = input.next();

        System.out.print("Where do you work? ");

                input.nextLine(); //<-- Weird thing where i had to absorb the ENTER press from previous input, didnt work without it.
        company = input.nextLine();

        email = firstName + "_" + lastName + "@" + company + ".com";

        System.out.print("Your name is " + firstName + " " + lastName + ".\n" + "You work at " + company
                            + " Your email will be: \n" + email);






    }
}
