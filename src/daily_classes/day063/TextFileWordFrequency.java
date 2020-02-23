package daily_classes.day063;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TextFileWordFrequency {

    public static void main(String[] args) {

        try{
            String str = Files.readString(Paths.get("src/daily_classes/day063/map.txt"));

            System.out.println(StringFrequency.getFrequencyMap(str));

        } catch (IOException e) {
            System.out.println("error!");
        }
    }
}
