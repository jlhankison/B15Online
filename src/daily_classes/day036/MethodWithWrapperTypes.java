package daily_classes.day036;

public class MethodWithWrapperTypes {

    public static void main(String[] args) {


        Integer i1 = 12;
        Integer i2 = Integer.valueOf(21);
        sumAndPrint(i1, i2);
    }

    /*
    * This method adds 2 Integer numbers and print
    * @param num1 type Integer, first number to add
    * @param num2 type Integer, second number to add
    * */
    public static void sumAndPrint (Integer num1, Integer num2){

        System.out.println(num1 + num2);
    }
}
