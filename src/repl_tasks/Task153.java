package repl_tasks;

import java.util.Scanner;

public class Task153 {


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s);
    }

    public static void person(String info) {

        //your code here

        String[] strAry = info.split(",");

        System.out.println("person name: " + strAry[0] + " last name: " + strAry[1] + " age: " + strAry[2]);



    }
}
