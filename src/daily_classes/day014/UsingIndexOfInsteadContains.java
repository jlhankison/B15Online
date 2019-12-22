package daily_classes.day014;


public class UsingIndexOfInsteadContains {

    public static void main(String[] args) {

        String name = "My name is Dink, I am the King of the boogie thing";

        if (name.indexOf("Dink")> -1){
            System.out.println("Dink found!");
        }else{
            System.out.println("There is no Dink, only Zuul");
        }
    }
}
