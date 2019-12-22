package repl_tasks;

import java.util.Scanner;

public class Task107 {

    public static void main(String[] args) {

        //DO NOT CHANGE
        int num, digit1, digit2, digit3, digit4, digit5;
        //WRITE YOUR CODE HERE

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number:");
        num = scan.nextInt();

        for (int i = 10000; i >= 1; i/= 10) {
            System.out.println(num/i);
            num = num%i;
        }



    }
}
