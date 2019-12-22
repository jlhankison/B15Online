package daily_classes.day015;

public class WarmUp_NameChecker {
    public static void main(String[] args) {


        String name = "Jordan hankison";

        //check whether your name length is less than 4
            //if so print "short name"
        //if it is within 5-10
            //print "medium name"
        //if it is more than 11
            //print "longer name"

        int nameLength = name.length();

        if (nameLength<=4){
            System.out.println("short name");
        }else if (nameLength<=10){
            System.out.println("medium name");
        }else{
            System.out.println("long name");
        }

    }
}
