package daily_classes.day009;

import java.util.Scanner;

public class SeniorNonSenior {

    public static void main(String[] args) {

        String citizenType;
        int age;
        Scanner scan = new Scanner(System.in);

        System.out.println("How old are you?");
        age = scan.nextInt();

        if (age > 65) {

            citizenType = "Senior";

        } else {

            citizenType = "Non-Senior";

        }

        System.out.println("At your age of " + age + " you are considered a " + citizenType);

    }
}
