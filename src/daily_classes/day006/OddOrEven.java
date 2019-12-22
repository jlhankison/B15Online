package daily_classes.day006;

public class OddOrEven {

    public static void main(String[] args) {


            int myNum1 = 10;
            int myNum2 = 11;

        System.out.println("Number 1 remainder of divided by 2: " + myNum1 % 2  );


        System.out.println("Number 2 remainder if divided by 2: " + myNum2 % 2  );

        System.out.println("Adding Number 1 and number 2 remainder: " + myNum2 + myNum2  );
//                          In this instance the text is CONCATENATING the string with myNum2 and myNum2 creating one long String of text

        System.out.println("Adding Number 1 and number 2 remainder: " + (myNum2 + myNum1)  );
//                          in this instance myNum1 and myNum2 are ADDED to each other first THEN concatenated onto the string
//                              following order of operations

        System.out.println("Adding Number 1 and number 2 remainder: " + (myNum2 + myNum1) % 2 );
//                          In this instance myNum2 and myNum1 are added first THEN  the remainder is found (% 2) THEN the whole string is
//                              concatenated. following order of operations.


    }
}
