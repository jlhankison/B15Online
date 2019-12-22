package repl_tasks;

import java.util.Scanner;

public class Task062 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the text:");
        String input = scan.next();

        System.out.println("Length is: " + input.length());
    }
}
