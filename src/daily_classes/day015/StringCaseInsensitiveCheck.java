package daily_classes.day015;

public class StringCaseInsensitiveCheck {

    public static void main(String[] args) {

        String name = "Jordan";

        //we want to check that this name contains "jo" no matter the case
        //so i want to store the uppercase version of this name then check for "JO"

        String upperCaseName = name.toUpperCase();  //"JORDAN"

        System.out.println("upperCaseName contains JO, true or false: " + upperCaseName.contains("JO"));

        //this is called method chaining, combining multiple method call
        // make my name all lowercase, then check whether it contains lowercase "st"

        System.out.println(name.toLowerCase().contains("jo"));


    }
}
