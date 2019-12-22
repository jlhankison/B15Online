package repl_tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task126 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        str = str.replace(" ", "");
        String[] strings = str.split(",");
        String shortest = strings[0],
                placeholder = "";
        int shortCount = 0,
                currentIndex = 0;

        for (String cycle : strings){
            if(cycle.length() < shortest.length()){
                shortest = cycle;

            }
        }
        for (String cycle : strings){
            if(cycle.length() == shortest.length()){
                shortCount ++;
            }
        }
        String[] shortArray = new String [shortCount];

        for (int i = 0; i < strings.length ; i++){
            if(strings[i].length() == shortest.length()){
                shortArray[currentIndex] = strings[i];
                currentIndex ++;
            }
        }
        for (int i = 0; i < shortArray.length; i++) {
            for (int j = i; j < shortArray.length; j++) {
                if(shortArray[i].charAt(0) > shortArray[j].charAt(0)){
                    placeholder = shortArray[i];
                    shortArray[i] = shortArray[j];
                    shortArray[j] = placeholder;
                }
            }

        }
        System.out.println(Arrays.toString(shortArray));


    }
}
