package Mentoring;

import java.util.Scanner;

public class Task035 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String userSelection = scan.nextLine();

        //WRITE YOUR CODE HERE

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
        String output = "Thank you for your purchase!",
                output2 = "Your current balance is: ";

        if (userSelection.equalsIgnoreCase("smartphone") || userSelection.equalsIgnoreCase("laptop")){
            System.out.println("Sorry, not enough funds on your gift card!");
        }else if( userSelection.equalsIgnoreCase("charger")){
            giftCard -= charger;
            System.out.println(output);
            System.out.println(output2 + giftCard + "$");
        }else if( userSelection.equalsIgnoreCase("usb cable")) {
            giftCard -= usbCable;
            System.out.println(output);
            System.out.println(output2 + giftCard + "$");
        }else if( userSelection.equalsIgnoreCase("usb cable")) {
            giftCard -= usbCable;
            System.out.println(output);
            System.out.println(output2 + giftCard + "$");
        }

    }


}

