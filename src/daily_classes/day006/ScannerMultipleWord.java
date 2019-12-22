package daily_classes.day006;

import java.util.Scanner;

public class ScannerMultipleWord {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("what is your name? ");

        String name = userInput.nextLine(); //<-- .nextLine() captures the whole line of text

        System.out.print("Where do you live (include the state)? ");

        String city = userInput.nextLine(); //<-- .nextLine() captures the whole line of text

        System.out.print("what is your Street Address? ");

        String address = userInput.nextLine(); //<-- .nextLine() captures the whole line of text

        System.out.print("Hello, My name is " + name + " I live in " + city + " my street address is " + address);


    }
}