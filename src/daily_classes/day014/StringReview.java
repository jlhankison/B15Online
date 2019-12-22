package daily_classes.day014;

import java.util.Scanner;

public class StringReview {
    public static void main(String[] args) {

        String str = "Pumpkin";
        System.out.println("String str = " + str);
        
        System.out.println( "str.contains(\"umpk\"); = " + str.contains("umpk"));

        boolean containsUmpk = str.contains("umpk");
        System.out.println("containsUmpk = " + containsUmpk); //<--shortcut to print variable value in nice format: soutv + enter
        
        boolean startedWithI = str.startsWith("I");
        System.out.println("startedWithI = " + startedWithI);
        
        boolean endWithUmpkin = str.endsWith("umpkin");
        System.out.println("endWithUmpkin = " + endWithUmpkin);

        // PASSWORD VALIDATOR
        //MINIMUM 8 CHAR MAX 16 CHAR
        //MUST CONTAIN _ OR $
        //MUST NOT CONTAIN SPACE
        //MUST START WITH AB

        Scanner scan = new Scanner(System.in);

        String password = scan.next();
        boolean min8max16 = password.length() >= 8 && password.length() <= 16;
        boolean mustContain = (password.contains("_") || password.contains("$")) && !password.contains(" ");
        boolean mustStartWithAb = password.startsWith("Ab");

        if (min8max16 && mustContain && mustStartWithAb) {
            System.out.println("VALID PASSWORD");

        }else{
            System.out.println("NOT A VALID PASSWORD");
        }


    }
}
