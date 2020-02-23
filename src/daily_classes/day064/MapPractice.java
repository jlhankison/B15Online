package daily_classes.day064;

        import java.util.*;

public class MapPractice {

    public static void main(String[] args) {

        Map<String, List<String> > groupMap = new HashMap<>();  // <-- In this map type you can have a LIST be the Value in the Key value pairing, this means that every key will have it's own List!

        groupMap.put("PowerOf4", Arrays.asList("Furkan", "Daria", "Serife", "Muge"));
        groupMap.put("Achievers" , Arrays.asList("Maiia", "Anastasia", "Zaki", "Toyly", "Like")  );
        groupMap.put("BugHunter" , Arrays.asList("Ayse","Rabiyam","Gulzina")  );
        groupMap.put("BugBusters", Arrays.asList("Rukhshona","Fariza","Seyma","Sumeyyra","Huvayda"));

        System.out.println("groupMap = " + groupMap);

        groupMap.forEach((groupCode , allMembers) -> System.out.println("groupCode = " + groupCode + "\n\tmembers : " + allMembers)); // <- this will print out each group key and then the list associated with it

        System.out.println(groupMap.get("Achievers").get(3)); // <-- this is a way that you can pull an individual from the key associated value list... in this case "Toyly"



        groupMap.forEach((groupCode, members) -> System.out.println(groupMap.get(groupCode).contains("Gulzina")) ); // <-- this will search all of the key-value lists for a name "Gulzina" and give a true or false statement



    }
}
