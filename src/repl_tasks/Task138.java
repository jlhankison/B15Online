package repl_tasks;

import java.util.Scanner;

public class Task138 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String reversed = "";
        //TODO: start your code here

        String[] strArr = sentence.split(" ");

        for (int i = strArr.length-1 ; i >= 0; i--) {
            reversed += strArr[i];
            if(i != 0){
                reversed += " ";
            }

        }






        //End your code here. do not modify below statement
        System.out.println(reversed);
    }
}
