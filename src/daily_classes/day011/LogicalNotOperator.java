package daily_classes.day011;

public class LogicalNotOperator {
    public static void main(String[] args) {

        //LOGICAL NOT OPERATOR "!" exclamation mark is used to negate the boolean value

        //CAN NOT BE USED ON ANY OTHER DATA TYPE OTHER THAN BOOLEAN
            //*** != is an operator, not a data type

        //! can be used directly to the value (true/false --> !true/!false)
        System.out.println("print result for (true): " + true);
        System.out.println("print result for (false): " + false);
        System.out.println("print result for (!true): " + !true);
        System.out.println("print result for (!false): " + !false);

        //! can also be used on a boolean VARIABLE
        boolean isRecording = false;
        System.out.println("\nboolean isRecording = " + isRecording);
        System.out.println("print result for (! isRecording): " +! isRecording);

        //! can also be used in front of a boolean expression
        //a boolean expression is any expression that results in a boolean value
        // for example 7>5, x>10, y==20, x<=100, x>y, x>10 && x<100

        System.out.println("\n!(7>5) = " + !(7>5));

        int x = 10;
        System.out.println("\nint x = 10");
        System.out.println("Result of (x>9) = " + (x>9));
        System.out.println("Result of !(x>9) = " + !(x>9));
        // !(x>10) -->> x<=10





    }
}
