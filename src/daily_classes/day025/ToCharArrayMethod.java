package daily_classes.day025;

import java.util.Scanner;

public class ToCharArrayMethod {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();

        char[] nameArray = name.toCharArray();

        for(char curChar : nameArray){
            System.out.println(curChar);
        }
    }
}
