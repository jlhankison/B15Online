package daily_classes.day005;

import java.util.Scanner;

public class VolumeConverter {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("How many gallons do you have?");
        double numGallon = userInput.nextDouble();

        double milliLiter = numGallon * 3785.412;

        System.out.println(numGallon + " gallon(s) is " + milliLiter + " milliliters");



    }
}
