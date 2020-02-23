package daily_classes.day063;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

public class GroupMapping {

    public static void main(String[] args) throws IOException {


        List<String> groupList = Files.readAllLines(Paths.get("src/daily_classes/day063/Group6.txt"));

        Map<Integer,String> result = FileHashMapping.mapFile(groupList);

        System.out.println("result = " + result);

        System.out.println("result.keySet() = " + result.keySet());

        System.out.println("result.values() = " + result.values());

        System.out.println("result.entrySet() = " + result.entrySet());



    }
}
