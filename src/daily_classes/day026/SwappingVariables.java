package daily_classes.day026;

public class SwappingVariables {

    public static void main(String[] args) {

        int x = 12,
                y = 32,
                placeholder;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println();

        //to swap x for y we have to hold one of the values being swapped in a temporary variable otherwise the value will be lost

        placeholder = x; //<--Storing the value of x in placeholder
        x = y ;  // <-- placing the value of y into x (without storing x into placeholder, x would have been lost by this overwrite)
        y = placeholder; //<-- takes the ORIGINAL value of x and places it within y.'

        System.out.println("placeholder = x;");
        System.out.println("x = y ;");
        System.out.println("y = placeholder;");
        System.out.println();

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
