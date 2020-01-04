package daily_classes.day036;

public class WrapperReview {

    public static void main(String[] args) {

        Integer i1 = new Integer(1000000000);
        Integer i2 = Integer.valueOf(123);

        //auto boxing : primitive -->> wrapper type object conversion
        Integer i3 = 45; // 45 primitive data --> 45 as an object value with Integer

        int i4 = 54;

        //auto unboxing : wrapper type to primitive type conversion
        int i5 = i2; //Integer "1000000000" --> raw int 1000000000

        //Auto boxing and unboxing is unique feature
        //of conversion between primitive value and wrapper class objects


    }
}
