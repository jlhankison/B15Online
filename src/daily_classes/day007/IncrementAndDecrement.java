package daily_classes.day007;

public class IncrementAndDecrement {

    public static void main(String[] args) {

        int apple = 10;
        System.out.println("original apple value = " + apple);

        apple = apple +1;   //Arithmetic operator, --> these all add 1 to variable "apple"
        System.out.println( "apple = apple + 1; = " + apple );

        apple += 1;         //Shorthand/Compound operator, --> these all add 1 to variable "apple"
        System.out.println("apple += 1; = " + apple );

        ++ apple;           //Increment operator, --> these all add 1 to variable "apple"
        System.out.println("++ apple; = "+ apple );

        apple = apple -1;   //Arithmetic operator, --> these all subtract 1 to variable "apple"
        System.out.println("apple = apple -1; = " + apple );

        apple -= 1;         //Shorthand/Compound operator, --> these all subtract 1 to variable "apple"
        System.out.println("apple -= 1; = " +  apple );

        --apple;            //Increment operator, --> these all subtract 1 to variable "apple"
        System.out.println("--apple; = " + apple );


        System.out.println( ++apple + " In this line ++apple was used directly in the println");




    }
}
