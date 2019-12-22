package repl_tasks;

import java.util.Scanner;

public class Task034 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int itemPrice, quarters, dimes, nickels, change;

        System.out.println("Enter price in cents:");
        itemPrice = scan.nextInt();

        if (itemPrice< 25 || itemPrice> 100){
            System.out.println("Invalid price!");
        }else if (itemPrice%5 != 0){
            System.out.println("Invalid price!");
        }else{
        change = 100 -itemPrice;
        nickels = change %25%10/5;
        dimes = change %25/10;
        quarters = change /25;

        System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels.");
        }
    }
}
