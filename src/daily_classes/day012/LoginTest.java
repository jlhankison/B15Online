package daily_classes.day012;

import java.util.Scanner;

public class LoginTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String userName = "user123", password ="pass123";

        System.out.println("Please enter your username:");
        String userInput = scan.next();
        System.out.println("Please enter your password ");
        String userPass = scan.next();

        if ( userInput.equals(userName) && userPass.equals(password)){
            System.out.println("You are logged in!");
        }else if (userInput.equals(userName)){
            System.out.println("your password is incorrect");
        }else if (userPass.equals(password)){
            System.out.println("your user name is incorrect");
        }else {
            System.out.println("your user name and password are incorrect.");
        }
    }
}
