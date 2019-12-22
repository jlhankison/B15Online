package daily_classes.day011;

import java.util.Scanner;

public class WarmUp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String targetOption, output = " light is on!";

        System.out.println("What light would you like to turn on?");

        targetOption = scan.next();

//        switch(targetOption){
//            case "Br":
//                System.out.println("Bedroom Light is now on!");
//            break;
//            case "Lr":
//                System.out.println("Living room light is on!");
//                break;
//            case "Ki":
//                System.out.println("Kitchen light is on!");
//                break;
//            case "Ha":
//                System.out.println("Hallway light is on!");
//                break;
//            default:
//                System.out.println("Invalid selection, no lights have changed.");
//        }

        if (targetOption.equals("Br")){
            System.out.println("Bedroom light is on!");
        }else if (targetOption.equals("Lr")){
            System.out.println("Bedroom light is on!");
        }else if (targetOption.equals("Ki")){
            System.out.println("Kitchen light is on!");
        }else if (targetOption.equals("Ha")){
            System.out.println("Hallway light is on!");
        }else{
            System.out.println("Invalid selection, no lights have changed.");
        }
    }
}
