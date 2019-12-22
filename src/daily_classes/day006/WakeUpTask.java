package daily_classes.day006;
import java.util.Scanner;
public class WakeUpTask {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double regularPrice, discountPercentage, discount, salePrice, amountSaved;

        System.out.print("Hello, How much is your item? $");

            regularPrice = scan.nextDouble();

        System.out.print("How much is your discount percentage? ");

            discountPercentage = scan.nextDouble() / 100;

            discount = discountPercentage * 100;

            salePrice = regularPrice * (1 - discountPercentage);

            amountSaved = regularPrice * discountPercentage;

        System.out.println("Your regular price is: $" + regularPrice);
        System.out.println("Your price is: $" + salePrice + "\nYou saved: $" + amountSaved);



    }
}
