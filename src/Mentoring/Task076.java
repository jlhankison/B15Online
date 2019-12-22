package Mentoring;

import java.util.Scanner;

public class Task076 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.next();
        String firstName = "",
                lastName = "",
                newInput = input;

        if(input.contains("_")){
            firstName = input.substring(0 , input.indexOf("_"));
            lastName = input.substring(input.indexOf("_") + 1 , input.indexOf("@"));
            newInput = newInput.replace(lastName, firstName);
            newInput.replaceFirst(lastName , firstName);

        }
        System.out.println(newInput);
    }
}
