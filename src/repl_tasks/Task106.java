package repl_tasks;

import java.util.Scanner;

public class Task106 {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below
        char[]  vowels = {'a','e','i','o','u'} ;


        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (word.charAt(i) == vowels[j]){
                    System.out.print(vowels[j]);
                }
            }
        }
    }
}
