package repl_tasks;

import java.util.Scanner;

public class Task088 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.nextLine();

        while (word.contains("cat")){
            word = word.replaceFirst("cat", "");
            countOfCats ++;
        }
        while (word.contains("dog")){
            word = word.replaceFirst("dog", "");
            countOfDogs++;
        }
        System.out.println(countOfCats == countOfDogs);


    }
}
