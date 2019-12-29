package daily_classes.day035;

public class WrapperTypePrimitiveTypeConversion {

    public static void main(String[] args) {

        Integer num1 = 100;  // --> this auto-boxes 100 --> new Integer(100); would be the long way

        int num2 = Integer.valueOf("200"); //--> this is auto-unboxing into 200 primitive data type

        System.out.println(Boolean.parseBoolean("yes"));
        System.out.println(Integer.parseInt("hello"));

    }
}
