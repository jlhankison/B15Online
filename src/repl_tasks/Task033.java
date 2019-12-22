package repl_tasks;

import java.util.Scanner;

public class Task033 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of milligrams in drink:");

        int mgInDrink = scan.nextInt();

        int drinkCount = (10*1000)/ mgInDrink ;

        System.out.println("It would take about " + drinkCount + " drinks for a lethal overdose.");
    }
}
