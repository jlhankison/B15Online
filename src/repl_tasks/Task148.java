package repl_tasks;

import java.util.Scanner;

public class Task148 {

    public static void cube(int x)
    {
        //your code here

        System.out.println(x*x*x);

    }//end cube

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        cube(x);

    }
}
