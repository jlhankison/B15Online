package daily_classes.day063;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindingChars {

    public static void main(String[] args) {


        String str = "The new link for joining class will require you to login to Okta, if it ask you to sign in " +
                ", please just click on it , it will take you too Okta signin page , once you signin with Okta" +
                "Then you will be able to join right away. PLEASE DO NOT TRY TO REGISTER , THE LINK IS ALREADY IN THE EMAIL" +
                "Click to join";
        
        String[] eachCharInStrArry = str.split("");

        List<String> charLst = Arrays.asList(eachCharInStrArry);
        
        Set<String> charSet = new HashSet<>(Arrays.asList(str.split("")));

        System.out.println("charSet = " + charSet);
    }
}
