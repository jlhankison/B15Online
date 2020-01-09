package repl_tasks;

import java.util.Scanner;

public class Task155 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter number");
        int num = inp.nextInt();


    }

    public static void next3 (int x){

        System.out.println("next 3 are:");

        for (int i = 0; i < 3; i++) {
            x ++;
            System.out.print(x);
            if(i < 2){
                System.out.print(" ");
            }
        }
    }
}
