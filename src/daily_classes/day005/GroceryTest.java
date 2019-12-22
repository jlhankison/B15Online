package daily_classes.day005;
import java.util.Scanner;


public class GroceryTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print( "What is the price of potatoes? $");

                float potatoPrice = scan.nextFloat();

            System.out.print("How many would you like to buy? ");

                float potatoNum = scan.nextFloat();

                float potatoTotal = potatoPrice * potatoNum;

            System.out.println("Your potatoes cost $" + potatoTotal + " total.");

        System.out.print("What is the price of tomatoes? $");

                float tomatoPrice = scan.nextFloat();

            System.out.print("How many would you like? ");

                float tomatoNum = scan.nextFloat();

                float tomatoTotal = tomatoPrice * tomatoNum;

            System.out.println("Your tomatoes cost $" + tomatoTotal + " total.");

        System.out.print("What is the price of Grapefruit? $");

                float gfPrice = scan.nextFloat();

            System.out.print("How many would you Like? ");

                float gfNum = scan.nextFloat();

                float gfTotal = gfNum *gfPrice;

            System.out.println("Your Grapfruit Cost $" + gfTotal + " total.");

        System.out.print("What is the price of bananas? $");

                float bananaPrice = scan.nextFloat();

            System.out.print("How many would you like? ");

                float bananaNum = scan.nextFloat();

                float bananaTotal = bananaNum * bananaPrice;

            System.out.println("Your banana(s) cost $" + bananaTotal + " total.");

        float groceryTotal = gfTotal + bananaTotal + tomatoTotal + potatoTotal;

        System.out.println("All your groceries together cost $" + groceryTotal);




    }
}
