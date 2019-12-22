package daily_classes.day008;

import java.util.Scanner;

public class WarmUpTask {

    public static void main(String[] args) {

        /*
        Voting Eligibility Program

        create age as int

        check whether this age is more than 18
        if yes print : you are ready to vote!!
        if no print : wait until you are 18
         */

        int age;
        Scanner scan = new Scanner(System.in);

        System.out.println("How old are you?");

        age = scan.nextInt();

        if (age >= 18) {

            System.out.println("Congratulations, you are old enough to vote");

        }else {

            System.out.println("Sorry, when you're older, kid");

        }

    }
}
