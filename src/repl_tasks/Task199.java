package repl_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task199 {

    public static void removeAll(ArrayList<String> wordList, String targetWord){

        while(wordList.contains(targetWord)){
            wordList.remove(targetWord);
        }
    }
}
