package repl_tasks;

import java.util.Scanner;

public class Task052 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("what is the farthest planet in the solar system:" );
        System.out.println("a)venus" );
        System.out.println("b)pluto" );
        System.out.println("c)neptune" );

        String a = s.nextLine();


        //your code here


        if (a.equals("a") || a.equals("c")){
            System.out.println(a + " is wrong");
        } else if (a.equals("b")) {
            System.out.println(a + " is correct");
        }else{
            System.out.println(a + " is not a valid answer");
        }
    }
}
