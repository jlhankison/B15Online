package daily_classes.day012;

import java.util.Scanner;

public class WarmUp2_SeasonChecker {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What number month is it?");
        int month = scan.nextInt();

        if (month<1 || month>12){
            System.out.println("Invalid Month");
        }else if(month>=3 && month<=5){
            System.out.println("It's Spring!");
        }else if(month>=6 && month<=8){
            System.out.println("Ah, Summer!");
        }else if(month>=9 && month<=11){
            System.out.println("Happy Fall!");
        }else{
            System.out.println("Boo! it's winter");
        }
}}
