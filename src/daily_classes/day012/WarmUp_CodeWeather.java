package daily_classes.day012;

import java.util.Scanner;

public class WarmUp_CodeWeather {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What's the weather outside?");
        String myWeather = scan.next();

        if (myWeather.equals("Sunny")){

            System.out.println("Code! Even though it's sunny.");
        }else if (myWeather.equals("Rainy")){

            System.out.println("Code in that rain!");
        }else if (myWeather.equals("Cloudy")){

            System.out.println("Code under that cloud!");
        }else if (myWeather.equals("Snowy")){

            System.out.println("Perfect weather for coding!");
        }else{
            System.out.println("Invalid selection, code anyways!");
        }

    }
}

