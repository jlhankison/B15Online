package SlackTasks;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This Class creates a "job offer" object. In the object is stored attributes about the offer and some behaviors associated
 */
public class Offer {

    String location;
    String company;
    double salary;
    boolean isFullTime;

    public void displayOfferDetails() {
        System.out.println("Location = " + location);
        System.out.println("Company = " + company);
        System.out.println("Salary = $" + salary);
        System.out.println("Full time: " + isFullTime);
    }

    public String toString(){
        String str = "[ Location = " + location + " | " +
                "Company = " + company + " | "+
                "Salary = $" + salary + " | " +
                "is it full time: " + isFullTime + " ]";
        return str;
    }

}
