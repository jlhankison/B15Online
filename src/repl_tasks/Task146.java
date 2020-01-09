package repl_tasks;

import java.util.Scanner;

public class Task146 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int x = scan.nextInt();

        System.out.println("Enter second number:" );
        int y = scan.nextInt();

        plus(x, y);
    }

    public static void plus(int x, int y){

        //your code here

        System.out.println("result: " +  (x+y));






    }

}

