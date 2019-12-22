package daily_classes.day012;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("What is the season?");
        String season = scan.next();

        if (season.equalsIgnoreCase("spring")){
            System.out.println("Hiking, Nature, Allergies, SUMMER COMING!");
        }else if (season.equalsIgnoreCase("summer")) {
            System.out.println("pool, swimming, sailing, beach");
        }else if (season.equalsIgnoreCase("Fall")) {
            System.out.println("Leaves, Halloween, cool air");
        }else if(season.equalsIgnoreCase("Winter")) {
            System.out.println("Coding, snow, sledding, getting pale");
        }else {
            System.out.println("Invalid selection");
        }

        System.out.println("END");

    }
}
