package daily_classes.day011;

import java.util.Scanner;

public class LogicalOperatorPractice {

    public static void main(String[] args) {

        //create a variable called num type int
        // find out whether this number is more than 100 or less than 10

        Scanner scan = new Scanner(System.in);


        System.out.println("type a number");
        int num = scan.nextInt();

        System.out.println("Is " + num + " more than 100 OR less than 10");
        System.out.println((num>100) || (num<10));
        System.out.println("Is " + num + " more than 100 OR less than 10");
        System.out.println((num>10) && (num<60));


    }
}
