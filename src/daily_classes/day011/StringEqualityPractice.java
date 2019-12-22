package daily_classes.day011;

public class StringEqualityPractice {

    public static void main(String[] args) {

        //checking for string equality should always be done by .equals method of the string

        //oneString.equals(anotherString) --> TRUE or FALSE
        //equals method coming from String class
        // each and every String object you created will have this functionality

        //just comparing two "String literal" directly using equals method
                //This is something you will rarely do...
        System.out.println("Java".equals("java")); //<-- CASE SENSITIVE, NOT EQUAL (FALSE)
        System.out.println("Java".equals("Java")); //<-- CASE SENSITIVE, EQUAL (TRUE)

        String myStr = "Java";

        System.out.println(myStr.equals("Java")); //

        String yourStr = new String("Java");

        System.out.println("is myStr EQUAL to yourStr? ");
        System.out.println(myStr.equals(yourStr));






    }
}
