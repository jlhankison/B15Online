package daily_classes.day013;

import java.util.Scanner;
public class WarmUp_Amazon2 {

    public static void main(String[] args) {

        String shoppingPreference, onlinePreference, storePreference;
        Scanner scan = new Scanner(System.in);


        System.out.println("Would you like to go shopping? true or false?");
        boolean isShopping = scan.nextBoolean();

        if (isShopping){
            System.out.println("Do you want to shop online or in a store?");
            shoppingPreference = scan.next();

            if (shoppingPreference.equalsIgnoreCase("online")) {
                System.out.println("where would you like to shop?\nType: Amazon, Ebay, or Craigslist");
                onlinePreference = scan.next();

                if (onlinePreference.equalsIgnoreCase("amazon")) {
                    System.out.println("You are shopping at the Amazon Online store!");
                } else if (onlinePreference.equalsIgnoreCase("ebay")) {
                    System.out.println("You are shopping at the Ebay online auction house!");
                } else if (onlinePreference.equalsIgnoreCase("craigslist")) {
                    System.out.println("You are shopping on Craigslist, local listings!");
                }else {
                    System.out.println("invalid selection");
                }
            }else if (shoppingPreference.equalsIgnoreCase("store")){
                System.out.println("What store would you like to go to?\nType: Trader Joe's, REI, or Good Will");
                scan.nextLine();
                storePreference = scan.nextLine();

                if (storePreference.equalsIgnoreCase("Trader joe's")){
                    System.out.println("You are shopping at Trader Joe's Grocery Store!");
                }else if ( storePreference.equalsIgnoreCase("REI")){
                    System.out.println("You are shopping at REI Outdoor Emporium!");
                }else if ( storePreference.equalsIgnoreCase("Good Will")){
                    System.out.println("You are shopping at Good Will Thrift store!");
                }else{
                    System.out.println("Invalid selection");
                }
            }else{
                System.out.println("Invalid selection");
            }
        } else if (!isShopping) {
            System.out.println("Good choice, shopping is expensive. Code instead!");
        }else{
            System.out.println("Invalid selection");
        }

    }
}
