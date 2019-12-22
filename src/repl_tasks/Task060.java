package repl_tasks;

import java.util.Scanner;

public class Task060 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int x = scan.nextInt();
        //WRITE YOUT CODE HERE

        String result = (x>5) ? "x" : "-x";
        System.out.println(result);

    }
}
