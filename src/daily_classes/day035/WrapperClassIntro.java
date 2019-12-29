package daily_classes.day035;

public class WrapperClassIntro {

    public static void main(String[] args) {

        int x = 10;
        // primitive data types are pure value, they have no attributes or behavior;

        Integer xObj1 = new Integer (12);
        //this is the old, non recommended way of creating an Integer object

        Integer xObj2 = Integer.valueOf(10);
        Integer xObj3 = Integer.valueOf("10");

        byte bValue = xObj2.byteValue();
        System.out.println("bValue = " + bValue);
    }
}
