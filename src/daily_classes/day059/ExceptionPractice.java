package daily_classes.day059;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionPractice {

    public static void main(String[] args) {

        System.out.println("The Start");

        String name = "Furkan";

        Scanner scan = new Scanner(System.in);
        System.out.println("What index do you want to get from Furkan's name");

        try {
            int targetIndex = scan.nextInt();
            System.out.println(name.charAt(targetIndex));  // <-- if the index is out of bounds IMMEDIATELY a StringIndexOutOfBoundsException Object will be created!
            System.out.println("End of try");

//        }catch (Exception blabla) { // <-- this is a general catch block that can catch ANY exception because it is the superclass of all exceptions

        }catch (StringIndexOutOfBoundsException e1) { // <-- this will ONLY catch StringIndexOutOfBoundsException type exceptions

            System.out.println(e1.getMessage());
            System.out.println("Your number was too high, here's the last letter of the word");

            System.out.println(name.charAt(name.length()-1));
        }catch (InputMismatchException e2){

            System.out.println(e2.getMessage());
            System.out.println("You have to enter a number!");
        }catch (Exception e3) {

            System.out.println("Something unknown happened");
            System.out.println(e3.getCause());
        }finally {
            System.out.println("This code will always run no matter what the error (or not) is");
        }

//        StringIndexOutOfBoundsException e1 = new StringIndexOutOfBoundsException();
//
//        System.out.println(e1.toString());

        System.out.println("The end");
    }
}
