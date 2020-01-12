package repl_tasks;

import java.util.Scanner;

public class Task161 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }

    public static void isPalindrome(int num){
        //WRITE YOUR CODE HERE

        String numStr = Integer.toString(num);
        boolean palindrome = true;

        for (int i = 0; i < numStr.length()/2; i++) {
            if (numStr.charAt(i) != numStr.charAt((numStr.length()-i)-1)){
                palindrome = false;
                break;
            }
        }
        System.out.println(palindrome);
    }
}
