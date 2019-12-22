package daily_classes.day014;

import java.util.Scanner;

public class EmailChecker {
    public static void main(String[] args) {

        //create a variable called email
        //check for below conditions:
            //if it does not contain char @ -> invalid email
            //if it contains " " -> invalid email
            // if it ends with @gmail.com --> gmail
            // @yahoo.com --> yahoo email
            //@mail.ru --> russian email

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your email address?");
        String email = scan.nextLine();

        boolean contains = email.contains("@") && !email.contains(" ");
        if (contains){
            if (email.endsWith("@gmail.com")){
                System.out.println("Gmail");
            }else if (email.endsWith("@yahoo.com")){
                System.out.println("Yahoo email");
            }else if (email.endsWith("@mail.ru")){
                System.out.println("Russian Email");
            }else{
                System.out.println("Unknown domain");
            }
        }else{
            System.out.println("Invalid Email");
        }
    }
}
