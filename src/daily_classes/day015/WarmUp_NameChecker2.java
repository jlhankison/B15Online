package daily_classes.day015;

public class WarmUp_NameChecker2 {
    public static void main(String[] args) {

        String name = "Jordan";

        name = name.toLowerCase();

        Boolean aOrE = (name.contains("a") ||  name.contains("e"));

        if (aOrE == true){
            System.out.println("name contains a or e");
        }else{
            System.out.println("name does not contain a or e");
        }
    }
}
