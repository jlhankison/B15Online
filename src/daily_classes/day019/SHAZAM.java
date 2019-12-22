package daily_classes.day019;

import java.util.Scanner;

public class SHAZAM {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("What is the secret super hero word?");
        String superHeroWord = scan.next();

        while (!superHeroWord.equals("SHAZAM!") ){

            System.out.println("WRONG!");
            System.out.println("What is the secret super hero word?");
            superHeroWord = scan.next();
        }
        System.out.println("YOU ARE NOW A SUPER HERO!");


    }
}
