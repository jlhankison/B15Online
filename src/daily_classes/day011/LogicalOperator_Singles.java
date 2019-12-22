package daily_classes.day011;

public class LogicalOperator_Singles {
    public static void main(String[] args) {

        // && 2 ampersand, & 1 ampersand --> Logical AND operator
        //this is used to check if both conditons are true at the same time

        //&& is called short circuit AND
            //does not check the next condition as long as the first condition is false
            // just like if you have multiple condition to launch a rocket
                // isEngineRunning, isCommunicationUp, isAirPressurized

                // isEngineRunning && isCommunicationUp && isAirPressurized
                // if isEngineRunning == false then it will not check any further conditions

        //& will check each and every condition no matter what
            //i.e. verifies both operands

            // isEngineRunning, isCommunicationUp, isAirPressurized
            // if isEngineRunning is false
            // it will still check isCommunicationUp
            // will still check isAirPressurized
            // will eventually give you the outcome

//        System.out.println(7>5 && 1>7);
//        System.out.println(5>5 && 1>7);
//        System.out.println(1>5 && 9>7);
//
//
//        System.out.println(7>5 & 1>7);
//        System.out.println(5>5 & 1>7);
//        System.out.println(1>5 & 9>7);

        //System.out.println(9/0); //ERROR!! CAN NOT DIVIDE BY 0
        //I want to check whether dividing 9 by 0 == 3
        //System.out.println(9/0 ==3);

        // combine the result of
        // is 5 more than 10
        // and 9 divided by 0 == 3
        System.out.println( 5>10 && 9/0 ==3  ); //<-- will process the comparison because it IGNORES
                                                    //the second condition after the first condition is false

        System.out.println( 5>10 & 9/0 ==3  ); //<-- will produce an ERROR! because it looks at all conditions
                                                //regardless if the first condition is false



        //Single pipe (|) operator will check all operands for true regardless if
            //if a true statement has already been found.

        System.out.println( 10>5 || 9/0 ==3  ); //<-- will process the comparison because it IGNORES
        //the second condition after the first condition shown to be TRUE

        System.out.println( 10>5 | 9/0 ==3  ); //<-- will produce an ERROR! because it looks at all conditions
        //regardless if the first condition is TRUE



    }
}
