package repl_tasks;

import java.util.Scanner;

public class Task039 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Cybertek Apartments!");
        System.out.println("Number of bedrooms you are interested:");
        int numberOfBedrooms = scan.nextInt();
        int startingPrice=0;
        //WRITE YOUR CODE HERE

        switch (numberOfBedrooms){
            case(1):
                System.out.println("One Bedroom Selected");
                startingPrice = 1100;
                break;
            case(2):
                System.out.println("Two Bedroom Selected");
                startingPrice = 1850;
                break;
            case(3):
                System.out.println("Three Bedroom Selected");
                startingPrice = 2550;
                break;
            default:
                System.out.println("No such Bedrooms available");
        }
            System.out.println("Starting Price: " + startingPrice);

    }
}
