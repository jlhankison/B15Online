package daily_classes.day010;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char operator = '/';


        switch (operator){
            case '+' :
                System.out.println("You are about to add numbers");
                break;
            case '-' :
                System.out.println("You are about to subtract numbers");
                break;
            case '*' :
                System.out.println("You are about to multiply numbers");
                break;
            case '/' :
                System.out.println("You are about to divide numbers");
                break;
            default:
                System.out.println("This is not a valid operator");
                break;
        }
    }
}
