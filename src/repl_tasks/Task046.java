package repl_tasks;

import java.util.Scanner;

public class Task046 {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        int num = inp.nextInt();
        //DO NOT CHANGE ABOVE CODE!  Write your code below

        if (num>0){
            System.out.println(num +" is positive");
        } else if (num < 0) {
            System.out.println(num + " is negative");
        }
    }
}
