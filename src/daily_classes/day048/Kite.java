package daily_classes.day048;

public class Kite implements Flyable {


    @Override
    public void fly() {
        if(HAVE_WING){
            System.out.println("Kite flying in the wind");
        }
    }


}
