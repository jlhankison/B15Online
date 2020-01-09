package repl_tasks;

import java.io.CharArrayReader;
import java.util.Arrays;

public class Task171 {

    public static void main(String[] args) {

        String[][] chessBoard = new String[8][8];
        //WRITE YOUR CODE HERE

        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {

                int y = 'a' + j;
                chessBoard[i][j] =  (i+1) + Character.toString((char)y);





            }
        }



        //DO NOT CHANGE
        System.out.println(Arrays.deepToString(chessBoard));
    }
}
