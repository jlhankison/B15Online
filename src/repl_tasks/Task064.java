package repl_tasks;

import java.util.Scanner;

public class Task064 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        int middleIndex = (word.length()-1) /2;


        if (word.length() % 2 == 1 && word.length() >= 3) {
            System.out.println(word.charAt(middleIndex));
        } else if (word.length() == 1) {
            for (int i = 0; i < 3 ; i++) {
                System.out.print(word);
            }
        }
        if (word.length() % 2 == 0 && word.length() >= 4) {
            System.out.println(word.substring(middleIndex , middleIndex + 2 ));
        }else if (word.length() == 2) {
            for (int i = 0; i < 2; i++) {
                System.out.print(word);
            }
        }
    }
}
