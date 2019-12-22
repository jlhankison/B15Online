package daily_classes.day006;

import java.util.Scanner;

public class CoinConverter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How much money are you starting with? $");

        float dollar = input.nextFloat();


        //you have purchased a candle for 74 cents,
        //what would be your remainder

        System.out.print("How much did you spend? $");

        dollar -= input.nextFloat() ;

        int cent = (int) (dollar * 100);

        dollar  = cent / 100;
        int remainingCent = cent % 100;
        int quarter =       remainingCent/25;
        remainingCent %= 25;
        int dime =          remainingCent/10;
        remainingCent %= 10;
        int nickel = remainingCent/5;
        remainingCent %= 5;

        System.out.println("You have: \n" + dollar + " Dollar(s)\n" + quarter + " Quarter(s)\n" + dime + " Dime(s)\n" + nickel + " Nickel(s)\n"
                + remainingCent + " Pennie(s) remaining");



    }
}
