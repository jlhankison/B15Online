package daily_classes.day063;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadingFilePractice {

    public static void main(String[] args) throws IOException {

        List<String> allData = Files.readAllLines(Paths.get("src/daily_classes/day063/employeeData.txt"));

        allData.forEach(each-> System.out.println(each));

        Map<Integer, String> employeeMap = new HashMap<>();

        allData.forEach(each -> employeeMap.put(Integer.parseInt(each.split(",")[0]), each.split(",")[1]));

        System.out.println("employeeMap = " + employeeMap);

    }
}
