package daily_classes.day008;

import java.util.Scanner;

public class WarmUpTask2 {
    public static void main(String[] args) {

        int myFavoriteNum = 75;
        int guessNum ;

        Scanner scan = new Scanner(System.in);

        System.out.println("I'm thinking about my favorite whole number, can you guess what it is?");

        guessNum = scan.nextInt();

        if (myFavoriteNum == guessNum) {
            System.out.println("WOW good guess, you nailed it.");
        }else {
            System.out.println("Yeah, sorry, that's not it. Not surprising really.");
        }
    }

}
