package repl_tasks;

import java.util.ArrayList;

public class Task198 {

    public static ArrayList combineAL(ArrayList<String> wordList1, ArrayList<String> wordList2){

        ArrayList<String> wordList3 = new ArrayList<>(wordList1);

        wordList3.addAll(wordList2);

        return wordList3;
    }
}
