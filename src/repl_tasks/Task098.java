package repl_tasks;

import java.util.Scanner;

public class Task098 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int count = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if(str.substring(i, i+2).equals("hi")){
                count ++;
            }
        }
        System.out.println(count);

        String[] sample = {"play", "friend", "butt"};



    }

}
