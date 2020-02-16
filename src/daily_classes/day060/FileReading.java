package daily_classes.day060;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReading {

    public static void main(String[] args) throws IOException {

        try{

            List<String> allLines = Files.readAllLines(Paths.get("src/daily_classes/day060/Note1.txt"));

            for (String each : allLines) {
                System.out.println(each);
            }
        }catch (Exception e){
            System.out.println("Boom!");
            System.out.println(e.getMessage());
        }
    }
}
