package repl_tasks;

import java.util.Scanner;

public class Task086 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter guest name:");
        String names = input.next(),
                userInput;
        boolean newGuest = true;

        while (newGuest){
            System.out.println("Do you want to enter new guest name:");
            userInput = input.next();
            if (userInput.equalsIgnoreCase("yes")){
                System.out.println("Please enter guest name:");
                names += ", " + input.next();
            }else if (userInput.equalsIgnoreCase("no")){
                System.out.println("Guest's list: " + names);
                newGuest = false;
            }else{
                System.out.println("Invalid entry, try again");
            }

        }
    }
}
