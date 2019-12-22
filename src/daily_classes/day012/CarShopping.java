package daily_classes.day012;

import java.util.Scanner;

public class CarShopping {

    public static void main(String[] args) {

        //Buy corolla or Tesla (only if it's within the budget)

        Scanner scan = new Scanner(System.in);

        String carBrand ="Corolla";

        System.out.print("What is your budget?\n$");
        int budget = scan.nextInt();
        int carPrice = 30000;

        if ( carPrice<= budget){
            System.out.println("You bought a tesla!");
        }else{
            System.out.println("You bought a Corolla");
        }



    }
}
