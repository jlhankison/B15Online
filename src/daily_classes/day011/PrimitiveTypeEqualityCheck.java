package daily_classes.day011;

public class PrimitiveTypeEqualityCheck {

    public static void main(String[] args) {


        //String name = "Jordan";

        char c1 = 'b';
        char c2 = 'B';
        char c3 = 'b';

        System.out.println("is c1 equal to c2?");
        System.out.println(c1 == c2);

        System.out.println("is c1 equal to c3?");
        System.out.println(c1 == c3);

        //All primitive types can be compared using == for their content equality
        //primitive types are pure value.
        int num1 = 10;
        int num2 = 10;
        System.out.println("\nis num1 equal to num2");
        System.out.println(num1 == num2);




    }
}
