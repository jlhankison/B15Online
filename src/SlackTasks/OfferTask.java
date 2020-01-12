package SlackTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class OfferTask {


    public static void main(String[] args) {


        Offer o1 = new Offer();
        o1.company = "Apple";
        o1.location = "Austin";
        o1.isFullTime = true;
        o1.salary = 140000;

        Offer o2 = new Offer();
        o2.location = "Boston";
        o2.company = "Google";
        o2.salary = 100000;
        o2.isFullTime = true;

        Offer o3 = new Offer();
        o3.company = "Amazon";
        o3.location = "Vancouver";
        o3.isFullTime = true;
        o3.salary = 96000;

        ArrayList<Offer> jobOffers = new ArrayList<>(Arrays.asList(o1,o2,o3));

        for (Offer next : jobOffers) {
            if (next.salary < 100000){
                next.salary += 5000;
            }
            System.out.println(next);
        }
    }
}
