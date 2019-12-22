package daily_classes.day013;

public class StringMethodPractice {

    public static void main(String[] args) {

        String name = "JoRdAn  H";

        System.out.println("String name = " + name);

        name = name.toUpperCase();
        System.out.println("name.toUpperCase() = " + name);

        name = name.toLowerCase();
        System.out.println("name.toLowerCase() = " + name);

        System.out.println("name.length() = " + name.length());
        System.out.println(".length() DOES NOT IGNORE SPACES!");

        int charCount = name.length();

        System.out.println("charCount = name.length() == " + charCount);

        System.out.println("name.startsWith(\"jor\") = " + name.startsWith("jor"));

        System.out.println("name.endsWith(\"an  h\") = " + name.endsWith("an  h"));



    }
}
