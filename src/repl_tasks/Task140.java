package repl_tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task140 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};


        //TODO: Write your code below

        String[] firstLastLetter = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            firstLastLetter[i] = "" + words[i].charAt(0) + words[i].charAt(words[i].length()-1);
        }
        System.out.println(Arrays.toString(firstLastLetter));
    }
}
