package daily_classes.day006;

import java.util.Scanner;

public class ScannerSingleWord {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("what is your name? ");

        String name = userInput.next();  //<-- will only capture the first word (separated by a space)

        String nextName = userInput.next(); //<-- captures second word

        int age = userInput.nextInt();


        System.out.println("variable \"name\" = " + name + "\nVariable \"nextName\" = " + nextName);

        System.out.println("You have entered age: " + age);




    }
}
