package daily_classes.day017;

import java.util.Scanner;

public class WakeUp_Task1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your full name?");
        String name = scan.nextLine();
        name = name.toLowerCase();

        name = name.replace(name.substring(0,1), name.substring(0,1).toUpperCase());

        name = name.replace(name.substring(name.indexOf(" ")+1, name.indexOf(" ")+2), //<--This finds the first char in the second word
                name.substring(name.indexOf(" ")+1, name.indexOf(" ")+2).toUpperCase()); //<-- This replaces the previous char with its Uppercase version

//        String originalFirst = name.substring(0, 1);
//        String replacement = originalFirst.toUpperCase();
//
//        name = name.replace(originalFirst,replacement);
//
//        originalFirst = name.substring(name.indexOf(" ")+1, name.indexOf(" ") + 2);
//        replacement = originalFirst.toUpperCase();
//
//        name = name.replace(originalFirst,replacement);

        System.out.println("name = " + name);
        
        
        
        
        
        
    }
}
