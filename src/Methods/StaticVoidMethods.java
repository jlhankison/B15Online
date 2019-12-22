package Methods;

public class StaticVoidMethods {

    public static void reversePrintMyName(){

        String name = "Jordan Hankison";

        for (int i = name.length() - 1; i >= 0 ; i--) {
            System.out.print(name.charAt(i));
        }
    }

    public static void reversePrintAnyWord(String word){

        for (int i = word.length() - 1 ; i >= 0  ; i--) {
            System.out.print(word.charAt(i));
        }
    }
    public static void printLastChar(String word){
        char lastChar = word.charAt(word.length()-1);

        System.out.println(lastChar);
    }

    public static void printFullNameInformation(String firstName , String lastName) {
        int fullNameLength = firstName.length() + lastName.length();
        System.out.println("Your first name is " +
                firstName);
        System.out.println("Your last name is " +
                lastName);
        System.out.println("Your full name length is " +
                fullNameLength);
    }

    public static void compareNameCharCount (String str1 , String str2){

        if (str1.length() > str2.length()){
            System.out.println(str1 + " is longer than " + str2);
        }else if (str2.length() > str1.length()){
            System.out.println(str2 + " is longer than " + str1);
        }else {
            System.out.println( str1 + " and " + str2 + " are equal in length");
        }
    }

    public static void printAToZ (){

        for (char i = 'A'; i < 'Z'; i++) {
            System.out.print(i);
        }
    }

    public static void printZToA   (){

        for (char i = 'Z'; i > 'A' ; i--) {
            System.out.print(i);

        }
    }

    public static void printAlphabetInRange (char beginning , char end){

        if(beginning < end){
            for (char i = beginning; i < end; i++) {
                System.out.print(i);
            }
        }else{
            for (char i = beginning; i >  end; i--) {
                System.out.print(i);
            }
        }
    }


}
