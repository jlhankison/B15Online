package Mentoring;

import java.util.Scanner;

public class Task077 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.next();
        // mike_tyson@gmail.com
        String firstName = "",
                lastName = "",
                domain = "",
                topDomain = "";

        firstName = input.substring(0 , input.indexOf("_"));
        //mike
        firstName = firstName.replaceFirst(firstName.substring(0 , 1) , firstName.substring(0 , 1).toUpperCase());
        //Mike

        lastName = input.substring(input.indexOf("_") + 1 , input.indexOf("@"));
        //tyson
        lastName = lastName.replaceFirst(lastName.substring(0 , 1) , lastName.substring(0 , 1).toUpperCase());
        //Tyson
        domain = input.substring(input.indexOf("@") + 1 , input.indexOf("."));
        //gmail
        topDomain = input.substring(input.indexOf(".")+1);
        //com


        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Domain: " + domain);
        System.out.println("Top-Level Domain: " + topDomain);

    }
}
