package daily_classes.day038;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice_ShortWay {

    public static void main(String[] args) {

        // create list of 6 double in short way,
        //we will just read them and will not add or remove items



        List<Double> prices = Arrays.asList(9.99, 242.11, 38.22, 3.57, 82.11, 78.09);
//        prices.add(93.18); <-- Will create error!
//        prices.remove(0);  <-- will create error! down side of quick way

        int count = 0;

        for (Double each : prices) {
            if( each > 5){
                ++count;
            }

        }
        System.out.println(count);

        //I want to add 2 more prices (does not have to be the same list);

        ArrayList<Double> newPrices = new ArrayList<>(prices);

        newPrices.add(199.99);
        newPrices.remove(3.57);

        ArrayList<Double> oneShotPrice
                = new ArrayList<>(Arrays.asList(9.99, 5.55, 3.76, 8.99));


    }
}
