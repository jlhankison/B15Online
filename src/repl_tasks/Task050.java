package repl_tasks;

import java.util.Scanner;

public class Task050 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        String in = s.next();

        //your code here

        float a = 10f;

        if (in.equals("burger") || in.equals("chicken")) {
            System.out.println(a);
        }
        if (in.equals("soda")) {
            System.out.println(2.0);
        }

    }
}
