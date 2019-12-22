package Mentoring;

import java.util.Scanner;

public class Task080 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char startChar = scan.next().charAt(0);
        char endChar = scan.next().charAt(0);

        if(startChar == endChar){
            System.out.print(endChar +": found");
        }else {
            while (startChar != endChar){
                if(startChar == 'A'){
                    startChar = 'B';
                    System.out.print("right ");
                }else if( startChar == 'B'){
                    startChar = 'C';
                    System.out.print("down ");
                }else if( startChar == 'C'){
                    startChar = 'D';
                    System.out.print("left ");
                }else if( startChar == 'D'){
                    startChar = 'A';
                    System.out.print("up ");
                }

                if(startChar != endChar){
                    System.out.print("> ");
                }else {
                    System.out.println(endChar +": found");
                }
            }

        }
    }
}
