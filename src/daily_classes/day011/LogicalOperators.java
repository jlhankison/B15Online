package daily_classes.day011;

public class LogicalOperators {

    public static void main(String[] args) {

        //Combining multiple conditions together

        //in java there is no range check
            //example
            //in math: 60 < x < 100 --> would translate to (true < 100)
            //in Java: (x > 60) && (x < 100)

        // && 2 ampersand, & 1 ampersand --> Logical AND operator
            //this is used to check if both conditons are true at the same time

        /*
                      true      true
        int x = 70;  x > 60 && x < 100; (TRUE)

                     false      true
        int x = 10;  x > 60 && x < 100; (FALSE)

                      true       false
        int x = 110;  x > 60 && x < 100; (FALSE)

                      true      true
        int x = 99;  x > 60 && x < 100; (TRUE)
         */

        System.out.println("\nLOGICAL AND (&&) TRUTH TABLE:");
        System.out.println("Result of (true && true) is: " + (true && true));
        System.out.println("Result of (false && true) is: " + (false && true));
        System.out.println("Result of (true && false) is: " + (true && false));
        System.out.println("Result of (false && false) is: " + (false && false));

        System.out.println("\nLOGICAL OR (||) TRUTH TABLE:");
        System.out.println("Result of (true || true) is: " + (true || true));
        System.out.println("Result of (false || true) is: " + (false || true));
        System.out.println("Result of (true || false) is: " + (true || false));
        System.out.println("Result of (false || false) is: " + (false || false));


        //more than 2 conditions at the same time, 3 conditions
                                  //true || false --> true
        System.out.println("\nResult of (true || false || false) is: " + (true || false || false));
                                  //true && false --> false
        System.out.println("Result of (true && true && false) is: " + (true && true && false));


        int x = 55;
        System.out.println("\nint x = " + x);

        System.out.println("\nIs x equal to 50, 51, or 55? " + (x==50 || x==51 || x==55));

        //TRICK QUESTION
        //check x is more than 50
        //AND x is not 52
        //OR x equals 57

        System.out.println("\nIs x more than 50, not equal to 52, or is equal to 57? "
                + ((x>50) && (x!=52) || (x==57)));



    }


}
