package daily_classes.day007;

public class RelationalOperator {

    public static void main(String[] args) {

        // > >= < <= == !=

        //Relation Operator is used to compare 2 operands
        //and return true or false

        System.out.println(7 > 5);
        System.out.println(7 >= -16);
        System.out.println(7 >= 7);

        System.out.println(7 < 5);
        System.out.println(5 <= 5);
        System.out.println(5 <= 7);



        //== is used to check for equality
        // AND VERY DIFFERENT FROM SINGLE "=" which is used to designate a variable or object "==" checks for equality

        System.out.println(5 == 5); //--> TRUE
        System.out.println(7 == 5); //--> FALSE

        // != is used to check for INEQUALITY
        System.out.println(7 != 5); //--> TRUE
        System.out.println(5 != 5); //--> FALSE


    }
}
