package daily_classes.day009;

import java.util.Scanner;

public class LanguagePicker {

    public static void main(String[] args) {

        int languageCode;

        String greeting = "";
        String courseName = ", SDET";

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your language, Select the number associated with your language\n1 English\n2 Arabic\n3 Spanish" +
                "\n4 Russian\n5 Turkish\n6 Hungarian\n7 French");

        languageCode = scan.nextInt();

        if(languageCode == 1){
            greeting = "Hello";

        }else if (languageCode == 2){
            greeting = "Salam";
        }else if (languageCode == 3){
            greeting = "Hola";
        }else if (languageCode == 4){
            greeting = "Privet";
        }else if (languageCode == 5){
            greeting = "Merhaba";
        }else if (languageCode == 6){
            greeting = "Szia";
        }else if (languageCode == 7){
            greeting = "Bonjour";
        }else{
            greeting = "Invalid Selection";
            courseName = "";
        }
        greeting += courseName;

        System.out.println(greeting);

    }
}
