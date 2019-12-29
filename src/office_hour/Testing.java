package office_hour;

import java.util.Arrays;
import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {

        add (23);
        add(15,60);
        add(15,60,45);
        add(15L,25L);

    }

    // create 3 static  void overloaded version version of add method
    // 1, add
    //       has 1 int parameter and add 100 to that number
    //       and print out the result
    // 2, add
    //      has 2 int parameters and add them to get sum
    //      and print out the result
    //  3, add
    //      has 3 int parameters and add them to get sum
    //       and print out the result
    // 4, add
    //      has 2 long parameters and add them to get sum
    //    and print out the result

    public static void add(int a, int b){
        System.out.println(a+b);

    }


    public static void add(int a){
        // Do I already have a method that add 2 numbers
        // System.out.println(num+100);
         add(a , 100);
    }


    public static void add(int a, int b, int c){
        System.out.println(a+b+c);

    }

    public static void add(long a, long b){
        System.out.println(a+b);
    }
}


