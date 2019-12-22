package daily_classes.day006;
import java.util.Scanner;

public class UsingTheValueOfOtherVariables {

    public static void main(String[] args) {


//        int myFavoriteNum = 300;
//
//        int yourFavoriteNum = myFavoriteNum;
//
//        System.out.println("my favorite number is " + myFavoriteNum + " your favorite number is " + yourFavoriteNum);
//
//        yourFavoriteNum = 100;
//
//        System.out.println("my favorite number is " + myFavoriteNum + " your favorite number is " + yourFavoriteNum);

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your order? ");

        String yourOrder = scan.nextLine();

        String myOrder = yourOrder;

        System.out.println("If you're ordering " + yourOrder + " I'll also have " + myOrder );







    }
}
