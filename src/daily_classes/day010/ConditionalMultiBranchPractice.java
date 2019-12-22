package daily_classes.day010;

import java.util.Scanner;

public class ConditionalMultiBranchPractice {

    public static void main(String[] args) {


        //At the McDonal's drive though

        System.out.println("Welcome to McDonald's, what can I get for you?");

        /*
        1, burger
        2, french fry
        3, chicken nuggets
        4, ice cream
        5, coke
         */

        Scanner scan = new Scanner(System.in);

        int selection = scan.nextInt();
        String order = "You ordered: ";


        switch (selection){

            case 1:
                order += "Burger";
                break;
            case 2:
                order  += "French Fries";
                break;
            case 3:
                order  +=  "chicken nuggets";
                break;
            case 4:
                order  +=  "ice cream";
                break;
            case 5:
                order  +=  "coke";
                break;
            default:
                order = "Invalid selection";
                break;

        }

        System.out.println(order);

    }
}
