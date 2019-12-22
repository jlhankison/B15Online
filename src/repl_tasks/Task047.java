package repl_tasks;

import java.util.Scanner;

public class Task047 {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        int num = inp.nextInt();
        //DO NOT CHANGE ABOVE CODE!  Write your code below

        if (num % 2 == 0) {

            System.out.println(num + " is even");
        }else {
            System.out.println(num + " is odd");
        }
    }
}
