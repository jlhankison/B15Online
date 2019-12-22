package daily_classes.day007;

public class RelationalOperator_with_variables {

    public static void main(String[] args) {

        // > >= < <= == !=

        //Relation Operator is used to compare 2 operands
        //and return true or false

        int myNumber = 10;

        System.out.println(myNumber > 5);
        System.out.println(myNumber >= -16);
        System.out.println(myNumber >= 7);

        System.out.println(myNumber < 5);
        System.out.println(myNumber <= 5);
        System.out.println(myNumber <= 7);



        //== is used to check for equality
        // AND VERY DIFFERENT FROM SINGLE "=" which is used to designate a variable or object "==" checks for equality

        System.out.println(myNumber == 5); //--> TRUE
        System.out.println(myNumber == 5); //--> FALSE

        // != is used to check for INEQUALITY
        System.out.println(myNumber != 5); //--> TRUE
        System.out.println(myNumber != 5); //--> FALSE


    }
}
