package daily_classes.day004;

public class ArithmeticOperator {

    public static void main(String[] args) {

        //arithmetic operator between to int -->> another int
        System.out.println( 5 + 3); // = 8
        System.out.println( 5 - 3); // = 2
        System.out.println( 5 * 3); // = 15
        System.out.println( 5 / 3); // = 1

        //Arithmetic operator between two numerical data types
        //the final result wil be the larger data type
        System.out.println( 5 + 3.0d); // = 8
        System.out.println( 5 - 3.0d); // = 2
        System.out.println( 5 / 3.0d); // = 15
        System.out.println( 5 * 3.0d); // = 1.66666666666667

        int firstNum = 5;
        double secondNum = 3.0D;
        float thrdNum = 3.0f;

        double result1 = firstNum + secondNum;
        double resutl2 = firstNum - secondNum;
        double result3 = firstNum / secondNum;
        float result4 = firstNum / thrdNum;
        double result5 = firstNum * secondNum;

        System.out.println("Result 1 = " + result1);
        System.out.println("Result 2 = " + resutl2);
        System.out.println("Result 3 (double) = " + result3);
        System.out.println("Result 4 (float) = " + result4);
        System.out.println("Result 5 = " + result5);



    }
}
