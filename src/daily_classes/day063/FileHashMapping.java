package daily_classes.day063;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileHashMapping {

    public static Map<Integer, String> mapFile (List<String> list){

        Map<Integer, String> integerStringMap = new HashMap<>();

        list.forEach(each -> integerStringMap.put(Integer.parseInt(each.split(",")[0]), each.split(",")[1]));

        return integerStringMap;
    }
}
