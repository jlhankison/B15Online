package daily_classes.day063;

import java.util.HashMap;
import java.util.Map;

public class StringFrequency {

    public static Map<String, Integer> getFrequencyMap(String string){

        Map<String, Integer> stringIntegerMap = new HashMap<>();

        for (String each : string.split(" ")) {
            if(!stringIntegerMap.containsKey(each)){
                stringIntegerMap.put(each, 1);
            }else{
                stringIntegerMap.replace(each, stringIntegerMap.get(each) +1 );
            }
        }
        return stringIntegerMap;
    }
}
