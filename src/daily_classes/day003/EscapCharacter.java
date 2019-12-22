package daily_classes.day003;

public class EscapCharacter {

    public static void main(String[] args) {

        //System.out.println("  Hello \ World");  <-- This will cause an error \ is an "escape character"

        System.out.println("Hello \\ World");  //<-- This is the proper way to indicate a "\"

        System.out.println("I like the book \"Java\""); //<-- this will make the phrase "Java" when printed

        System.out.println("The name of the movie is: \'Lord of the Rings'"); // <-- in newer versions of Java you do
                                                                                        //not need to add "\" for '
        System.out.println("Hello\tWorld");

        System.out.println("Hello\nWorld");

        System.out.print("This is regular print with \\n\n");

        System.out.println("this is println");

    }
}
