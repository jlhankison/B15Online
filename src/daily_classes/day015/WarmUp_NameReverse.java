package daily_classes.day015;

public class WarmUp_NameReverse {

    public static void main(String[] args) {

        String name = "Jordan";
        //how to find the last character of any string
        //counting character starts with 1 (.length())
        //counting index starts with 0 (.charAt(), .indexAt())
        //so last character index/location will always be -1 than the actual character count
        
        //"Jordan" has 6 characters
        //the last INDEX of "Jordan" will be 5
        
        int characterCount = name.length();
        System.out.println("characterCount = " + characterCount);
        int lastCharIndex = characterCount - 1;
        System.out.println("lastCharIndex = " + lastCharIndex);
        char lastChar = name.charAt(lastCharIndex);
        System.out.println("lastChar = " + lastChar);

        name.charAt(name.length()-1); //<-- one step method of gaining last char in .charAt()

        System.out.print(name.charAt(5));
        System.out.print(name.charAt(4));
        System.out.print(name.charAt(3));
        System.out.print(name.charAt(2));
        System.out.print(name.charAt(1));
        System.out.print(name.charAt(0));
    }
}
