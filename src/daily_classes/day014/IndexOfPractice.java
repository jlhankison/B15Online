package daily_classes.day014;

public class IndexOfPractice {
    public static void main(String[] args) {

        String name = "Game of Java";

        //find out the location of Java
        //find out the location of letter o
        //find out the location of the first space

        System.out.println("find out the location of Java");
        System.out.println(name.indexOf("Java")); //total length is 12, last char index is 12

        System.out.println("find out the location of o");
        System.out.println(name.indexOf("o"));

        System.out.println("find out the location of o");
        System.out.println(name.indexOf("O")); // outputs -1 because O does not exist in the string

        System.out.println("find out the location of \" \"");
        System.out.println(name.indexOf(" "));


    }
}
