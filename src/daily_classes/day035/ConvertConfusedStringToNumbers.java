package daily_classes.day035;

public class ConvertConfusedStringToNumbers {

    public static void main(String[] args) {

        String random = "A123b3W423cc4523B $$ aa 77J JsG8 2347SDFSJF";

        System.out.println(extractNumber(random));

        System.out.println(extractUpperCase(random));

        System.out.println(extractLowerCase(random));



        // random = "A123b3W423cc4523B $$ aa 77J JsG8 2347SDFSJF"
        // str = random;

//        Character charObject = Character.valueOf('a');
//        System.out.println("Get Character Object-> Character.valueOf('a') = " + Character.valueOf('a'));
//        System.out.println("Character.isDigit('7') = " + Character.isDigit('7')); --> returns boolean
//        System.out.println("Character.isLetter('A') = " + Character.isLetter('A'));  -- returns boolean
//        System.out.println("Character.isLetterOrDigit('@') = " + Character.isLetterOrDigit('@')); --> returns boolean
//        System.out.println("Character.isUpperCase('a') = " + Character.isUpperCase('a'));
//        System.out.println("Character.isLowerCase('b') = " + Character.isLowerCase('b'));
//        System.out.println("Character.toUpperCase('a') = " + Character.toUpperCase('a'));
//        System.out.println("Character.toLowerCase('A') = " + Character.toLowerCase('A'));
        // "A123b3W423cc4523B $$ aa 77J JsG8 2347SDFSJF"
//        Try out above Character methods given to you and try to solve the problem of extracting the number out of
//        the string

    }

    public static long extractNumber (String str){

        String extractedString = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                extractedString += str.charAt(i);
            }
        }

        return Long.parseLong(extractedString);


    }
    public static String extractUpperCase (String str){

        String output = "";
        for (int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i))){
                output += str.charAt(i);
            }
        }
        return output;
    }
    public static String extractLowerCase (String str){

        String output = "";
        for (int i = 0; i < str.length(); i++) {
            if(Character.isLowerCase(str.charAt(i))){
                output += str.charAt(i);
            }
        }
        return output;
    }
}
