package daily_classes.day063;

import java.util.HashMap;
import java.util.Map;

public class MapIntroAddingElements {

    public static void main(String[] args) {


        Map<String, Integer> nameAge = new HashMap<>();

        // Adding element: put

            nameAge.put("Zehra", 6);
            nameAge.put("Jordan", 28);
            nameAge.put("Eli", 26);
            nameAge.put("Jameson", 14);
            nameAge.put("Faith", 27);

        System.out.println("nameAge = " + nameAge);

        System.out.println("nameAge.get(\"Jordan\") = " + nameAge.get("Jordan"));

        nameAge.replace("Zehra", 12);

        System.out.println("nameAge.get(\"Zehra\") = " + nameAge.get("Zehra"));
    }
}
