package repl_tasks;

import java.util.Scanner;

public class Task084 {
    public static void main(String[] args) {

        int freeBooks = 0;
        Scanner scan = new Scanner(System.in);
        boolean isPremiumCustomer = scan.nextBoolean();
        int nbooksPurchased = scan.nextInt();

        if (isPremiumCustomer && nbooksPurchased>=8) {
            freeBooks = 2;
        } else if (isPremiumCustomer && nbooksPurchased>= 5) {
            freeBooks = 1;
        }else if (nbooksPurchased>=12){
            freeBooks =2;
        }else if (nbooksPurchased>= 7){
            freeBooks = 1;
        }
        System.out.println(freeBooks);
    }
}
