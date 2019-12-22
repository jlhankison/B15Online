package repl_tasks;

import java.util.Scanner;

public class Task067 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        String newWord = "";

        if (word.length() == 5) {

            for (int i = word.length()-1 ; i >= 0; i--) {
                newWord += word.charAt(i);

            }
            System.out.println(newWord);
        } else if (word.length() > 5) {
            System.out.println("Too long!");
        }else{
            System.out.println("Too Short!");
        }
    }
}
