package Mentoring;

import java.util.Scanner;

public class Task080_Mk2 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        char startPoint = scan.next().charAt(0);
        char endPoint = scan.next().charAt(0);

        if (startPoint == endPoint){
            System.out.println(endPoint + " found");
        }else{
            while(startPoint != endPoint){

                if(startPoint == 'A'){
                    startPoint = 'B';
                    System.out.print("Right ");
                }else if(startPoint == 'B'){
                    startPoint = 'C';
                    System.out.print("Down ");
                }else if(startPoint == 'C'){
                    startPoint = 'D';
                    System.out.print("Left ");
                }else if(startPoint == 'D'){
                    startPoint = 'A';
                    System.out.print("Up ");
                }
                if(startPoint != endPoint){
                    System.out.print("> ");
                }else{
                    System.out.print(endPoint + " found");
                }




            }
        }

    }
}
