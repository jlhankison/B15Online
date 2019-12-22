package daily_classes.day011;

import java.util.Scanner;

public class LogicalOperator_Task1 {
    public static void main(String[] args) {

        //create a program to check the score

            //create a variable called score, assign a value of your choice

        //if the score is < 0 or > 100 --> invalid score
        //if the score is

        Scanner scan = new Scanner(System.in);

        System.out.println("What was your score?");
        int score = scan.nextInt();


        if (score<0 || score>100){
            System.out.println("Invalid score.");
        }else if (score == 100){
            System.out.println("Perfect score!");
        }else if (score>=70){
            System.out.println("You have passed!");
        }else if (score>=40){
            System.out.println("Study a little more and you will pass");
        }else if (score>=30){
        System.out.println("You need to attend more class");
        }else {
            System.out.println("Come to my office");
        }



        }
}
