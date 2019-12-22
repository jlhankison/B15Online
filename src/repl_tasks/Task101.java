package repl_tasks;

import java.util.Scanner;

public class Task101 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        int javaCounter = 0,
                pythonCounter = 0,
                jLength = "java".length(),
                pLength = "python".length();

        for (int i = 0; i < sentence.length() - jLength; i++) {
            if (sentence.substring(i, i + jLength).equals("java")){
                javaCounter ++;
            }
        }
        for (int i = 0; i < sentence.length() - pLength; i++) {
            if (sentence.substring(i, i + pLength).equals("python")){
                pythonCounter ++;
            }
        }

        if (pythonCounter == javaCounter){
            System.out.println(true);
        }else{
            System.out.println(false);
        }


    }
}
