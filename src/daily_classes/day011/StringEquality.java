package daily_classes.day011;

public class StringEquality {

    public static void main(String[] args) {


        String name = "Jordan"; //<-- this is called a "String literal"
        String name2 = new String("Jordan");
        String name3 = "Jordan";

        System.out.println(name);
        System.out.println(name2);
        System.out.println(name3);

        System.out.println("USING == METHODS");
        System.out.println(name == name2);
        System.out.println(name == name3);

        //The correct way of comparing String to get CONSISTENT results is
        // using one of the String object behaviour / method called
        //equals method
        // str1.equals(str2)
        System.out.println("USING .equals() METHODS");
        System.out.println(name.equals(name2));
        System.out.println(name.equals(name3));



    }
}
