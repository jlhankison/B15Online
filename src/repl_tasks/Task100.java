package repl_tasks;

import java.util.Scanner;

public class Task100 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0;

        for (int i = 0; i < str.length()-"bread".length()+1; i++) {
            if (str.substring(i, i + "bread".length()).equals("bread")){
                count ++;
            }
        }


        if(count > 1){

            System.out.println(str.substring(str.indexOf("bread")+ 5, str.lastIndexOf("bread")));
        }else{
            System.out.println("nothing");
        }
    }
}
