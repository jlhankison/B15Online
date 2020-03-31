package codingBatTasks;

import java.util.Map;

public class MapBully {

    public static Map<String, String> mapBully(Map<String, String> map) {

        if (map.containsKey("a") && map.containsKey("b")) {
            map.replace("b", map.get("a"));
        } else if (map.containsKey("a")) {
            map.put("b", map.get("a"));
        }

        map.replace("a", "");
        return map;
    }
}
