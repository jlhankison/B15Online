package repl_tasks;

import java.util.Scanner;

public class Task090 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Split:");
        String split = scan.next();

        System.out.println("Number of people:");
        int people = scan.nextInt();

        System.out.println("Check amount:");
        float amount = scan.nextFloat(),
                tipPercentage = 0,
                tipTotal,
                tipPerPerson,
                totalAmount,
                totalPerPerson;

        System.out.println("Service Quality:");
        String quality = scan.next(),
                peopleRepresented = "";

        String[] qualities = {"Poor", "Fair", "Good", "Great", "Excellent"};

        for (int i = 0; i < people; i++) {
            peopleRepresented += "&";
        }

        for (int i = 0; i < qualities.length; i++) {
            if (quality.equalsIgnoreCase(qualities[i])){
                tipPercentage = (i+1)*.05f;
            }
        }
        tipTotal = amount * tipPercentage;
        totalAmount = tipTotal + amount;
        totalPerPerson = totalAmount/people;
        tipPerPerson = tipTotal/people;

        System.out.println("Number of people entered: " + peopleRepresented);
        System.out.println("Total to pay: " + totalAmount);
        System.out.println("Total tip: " + tipTotal);
        System.out.println("Total per person: " + totalPerPerson);
        System.out.println("Tip per person: " + tipPerPerson);



    }
}
