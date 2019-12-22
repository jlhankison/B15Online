package repl_tasks;

import java.util.Scanner;

public class Task027 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String subject1, subject2, subject3, subject4, subject5, summary;
        double grade1, grade2, grade3, grade4, grade5, average;

        System.out.println("Welcome to the Grader!");

        System.out.println("Please enter Subject name number 1 and the score for this subject");
            subject1 = scan.next();
            grade1 = scan.nextDouble();
        System.out.println("Please enter Subject name number 2 and the score for this subject");
            subject2 = scan.next();
            grade2 = scan.nextDouble();
        System.out.println("Please enter Subject name number 3 and the score for this subject");
            subject3 = scan.next();
            grade3 = scan.nextDouble();
        System.out.println("Please enter Subject name number 4 and the score for this subject");
            subject4 = scan.next();
            grade4 = scan.nextDouble();
        System.out.println("Please enter Subject name number 5 and the score for this subject");
            subject5 = scan.next();
            grade5 = scan.nextDouble();

        summary = "Summary: " + subject1 + " - " + grade1 + ", "
                + subject2 + " - " + grade2 + ", " + subject3 + " - " + grade3 + ", "
                + subject5 + " - " + grade5 + ", ";

        average = (grade1 + grade2 + grade3 + grade4 + grade5) / 5;

        System.out.println(summary);
        System.out.println("Your average score is: " + average);
        System.out.println("Thank you for using Grader!");
        System.out.println("Goodbye!");


    }
}
