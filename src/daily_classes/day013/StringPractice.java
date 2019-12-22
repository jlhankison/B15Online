package daily_classes.day013;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {

        int x = 10; //<-- this is pure value, not a reference to another place in memory, it is entirely stored within the stack

        Scanner scan = new Scanner(System.in); //<-- "scan" is a variable and is stored in the stack but DOES NOT store the data of the object Scanner. It is just
                                                //a reference to the ADDRESS of Scanner in Heap
                                                //"new" tells Java to create a NEW object in heap

        String  s1 = new String("abc");
        String s2 = "hello";


    }
}
