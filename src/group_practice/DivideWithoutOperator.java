package group_practice;

public class DivideWithoutOperator {

    public static void main(String[] args) {
        System.out.println(divide(-53 , 5));
    }

    public static int divide (int x, int y){


        // psudo code:
        /*
        Goal: divide X by Y without using /

        first make an array the size of y. this will create Y number of parts that i can separate x into
        next, nest a for loop the length of Y inside a while loop that continues until x < y. This allows me to keep distributing X into Y groups until there is not enough in X to fully distribute into Y
        I will distribute by increasing the value of each space in the array by 1 while decreasing x by 1 at the same time
         */
        int symbol = 1;
        if(x * y < 0){
            symbol = -1;
        }
        if (x< 0){
            x *= -1;
        }
        if (y < 0 ){
            y *= -1;
        }
        int quotient = 0;

        while( x>y){
            x-= y;
            quotient++;
        }
        quotient *= symbol;
        return quotient ;

    }
}
