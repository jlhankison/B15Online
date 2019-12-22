package repl_tasks;

import java.util.Scanner;

public class Task102 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        String html = scan.nextLine();

        if (html.contains("<html>")){
            html = html.substring(html.indexOf("id=\"") + 4);
            html = html.substring(0, html.indexOf("\""));
            System.out.println(html);
        }else{
            System.out.println("Invalid input!");
        }

    }
}
