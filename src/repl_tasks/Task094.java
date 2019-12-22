package repl_tasks;

import java.util.Scanner;

public class Task094 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;

        do {
            System.out.println("Enter Item" + count + " and its price:");
            item = scan.next();
            price = scan.nextDouble();
            totalPrice += price;
            System.out.println("Add one more item?");
            countinue = scan.next();
            if(countinue.equalsIgnoreCase("yes")){
                shoppingListReport += "Item" + count + ": " + item + " Price: " + price + ", ";
            }else if (countinue.equalsIgnoreCase("no")){
                shoppingListReport += "Item" + count + ": " + item + " Price: " + price;
            }
            count ++;

        }while (countinue.equalsIgnoreCase("yes"));

        System.out.println(shoppingListReport);
        System.out.println("Total price: " + totalPrice);


    }
}
