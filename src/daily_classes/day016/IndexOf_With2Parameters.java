package daily_classes.day016;

public class IndexOf_With2Parameters {

    public static void main(String[] args) {

//                     012345678901234567890123456789012345678
        String name = "They love Java they love Java Java Java";

        //get the second java from the sentence
        //assume you already know there is 4 Java's in this sentence
        //second Java means --> the java that shows up after the first instance

        //first find out where is the location of the first Java
        //in order to find the second one,
        //instead of searching from beginning, search from directly after the location of first Java
        //it will then give you the index of the second Java

        //INDEX OF ALWAYS STARTS FROM THE BEGINNING

        //indexOf method has 2 versions one expects 1 input of external data
        //another expects 2 inputs of external data

        System.out.println(name.indexOf("Java", name.indexOf("Java") + 1));

        System.out.println("Search for Java starting from index of " + (name.indexOf("Java") + 1) + " = " + name.indexOf("Java", name.indexOf("Java")+1));

        int firstJava = name.indexOf("Java");
        int secondJava = name.indexOf("Java", firstJava+1);
        int thirdJava = name.indexOf("Java", secondJava+1);
        int fourthJava = name.indexOf("Java", thirdJava+1);


        System.out.println(firstJava + ", " + secondJava + ", " + thirdJava + ", " + fourthJava);
    }
}
