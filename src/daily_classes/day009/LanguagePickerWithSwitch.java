package daily_classes.day009;

import java.util.Scanner;

public class LanguagePickerWithSwitch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String greeting = "";
        String course = ", SDET";


        System.out.println("What is your language, Select the number associated with your language\n1 English\n2 Arabic\n3 Spanish" +
                "\n4 Russian\n5 Turkish\n6 Hungarian\n7 French");
        int languageCode = scan.nextInt();


        switch (languageCode){

            case 1:
                greeting = "Hello";
                break;
            case 2:
                greeting = "Salam";
                break;
            case 3:
                greeting = "Hola";
                break;
            case 4:
                greeting = "Priviet";
                break;
            case 5:
                greeting = "Marhaba";
                break;
            case 6:
                greeting = "szia";
                break;
            case 7:
                greeting = "Bonjour";
                break;
            default:
                greeting = "Invalid entry";
                course = "";
        }

        System.out.println(greeting + course);

    }
}
