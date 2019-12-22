package repl_tasks;

import java.util.Scanner;

public class Task044 {
    public static void main(String[] args) {

        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        //WRITE YOUR CODE HERE

        System.out.println("Enter age:");
        int age = scan.nextInt();

        if (age<2 || age>18) {
            System.out.println("ineligible");
        }else if (age==2) {
            System.out.println("toddler");
        }else if (age<=5) {
            System.out.println("early childhood");
        }else if (age<=7) {
            System.out.println("young reader");
        }else if (age<=10) {
            System.out.println("elementary");
        }else if (age<=12) {
            System.out.println("middle");
        }else if (age==13) {
            System.out.println("impossible");
        }else if (age<=16) {
            System.out.println("high school");
        }else {
            System.out.println("scholar");
        }
    }
}
