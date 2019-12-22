package repl_tasks;

import java.util.Scanner;

public class Task080 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();

        char startChar = start.charAt(0),
                endChar = end.charAt(0);

        if (startChar != endChar) {  //Step 1a: if Start is NOT equal to end, proceed
            while(startChar != endChar) { //Step 2: WHILE Start is not equal to end, loop
                if (startChar == 'a' || startChar == 'A'){ //Step 3: Cycle through if else statement looking for startChar. Once found; print direction, then replace startChar with next, clockwise, char value.
                    System.out.print("right");
                    startChar = 'b';
                }else if (startChar == 'b' || startChar == 'B'){
                    System.out.print("down");
                    startChar = 'c';
                }else if (startChar == 'c' || startChar == 'C'){
                    System.out.print("left");
                    startChar = 'd';
                }else if (startChar == 'd' || startChar == 'D'){
                    System.out.print("up");
                    startChar = 'a';
                }
                if (startChar == endChar){ //Step 4a: If startChar equals endChar --> finish print, end program
                    System.out.print(": " + endChar + " found");
                }else{
                    System.out.print(" > "); //Step 4b: if startChar does NOT equal endChar, proceed with while loop
                }
            }
        }else{
            System.out.println(endChar + " found"); //Step 1b: if startChar IS equal to endChar, print "found" and end program
        }
    }
}
