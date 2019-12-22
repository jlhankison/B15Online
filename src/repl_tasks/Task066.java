package repl_tasks;

import java.util.Scanner;

public class Task066 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //YOUR CODE HERE

        if (word1.length() == 3 && word2.length() == 3) {

            for (int i = 0; i < 3; i++) {
                System.out.print("" + word1.charAt(i) + word2.charAt(i));

            }
        }else{
            System.out.println("cannot merge");
        }


    }
}
