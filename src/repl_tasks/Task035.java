package repl_tasks;

import java.util.Scanner;

public class Task035 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Input");
        String userSelection = scan.nextLine();

        int giftCard = 100,
                remainder = -1,
                smartphone = 300,
                laptop = 400,
                charger = 15,
                usbCable = 10,
                headphones = 30,
                pants = 50,
                hat = 25,
                socks = 5,
                blanket = 60,
                pillow = 40;
        String output = "Thank you for your purchase!";

        if (userSelection.equalsIgnoreCase("smartphone") || userSelection.equalsIgnoreCase("laptop")){
            System.out.println("Sorry, not enough funds on your gift card!");
        }else if( userSelection.equalsIgnoreCase("charger")){
            remainder = giftCard - charger;
            System.out.println(output);
        }else if( userSelection.equalsIgnoreCase("usb cable")){
            remainder = giftCard - usbCable;
            System.out.println(output);
        }else if( userSelection.equalsIgnoreCase("headphones")){
            remainder = giftCard - headphones;
            System.out.println(output);
        }else if( userSelection.equalsIgnoreCase("pants")){
            remainder = giftCard - pants;
            System.out.println(output);
        }else if( userSelection.equalsIgnoreCase("hat")){
            remainder = giftCard - hat;
            System.out.println(output);
        }else if( userSelection.equalsIgnoreCase("socks")){
            remainder = giftCard - socks;
            System.out.println(output);
        }else if( userSelection.equalsIgnoreCase("blanket")){
            remainder = giftCard - blanket;
            System.out.println(output);
        }else if( userSelection.equalsIgnoreCase("pillow")){
            remainder = giftCard - pillow;
            System.out.println(output);
        }else{
            System.out.println("Invalid item!");
        }
        if (remainder>= 0){
            System.out.println("Your current balance is: " + remainder + "$");
        }
    }
}
