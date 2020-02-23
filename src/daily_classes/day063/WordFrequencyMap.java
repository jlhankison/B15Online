package daily_classes.day063;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyMap {

    public static void main(String[] args) {


        String str = "Finding Words Frequency Sounds Fun Because Fun Comes in When you count Words" +
                " But How do I count the Words with what I already know previously " +
                "Do it and find out Words Words Words";

        Map<String, Integer> stringIntegerMap = new HashMap<>();

//        String[] strArry = str.split(" ");
//
//        for (int i = 0; i < strArry.length; i++) {
//
//            if (!stringIntegerMap.containsKey(strArry[i])){
//                stringIntegerMap.put(strArry[i], 1);
//            }else{
//                stringIntegerMap.replace(strArry[i], stringIntegerMap.get(strArry[i]) + 1);
//            }
//        }
//        System.out.println("stringIntegerMap = " + stringIntegerMap);

        for (String each : str.split(" ")) {
            if(!stringIntegerMap.containsKey(each)){
                stringIntegerMap.put(each, 1);
            }else{
                stringIntegerMap.replace(each, stringIntegerMap.get(each) +1 );
            }
        }
        System.out.println("stringIntegerMap = " + stringIntegerMap);
    }


}
