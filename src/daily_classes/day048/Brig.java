package daily_classes.day048;

public class Brig implements TallShip{

    String name;
    private String shipType = "Brig";
    String nationality;

    public Brig(String name, String nationality) {
        this.name = name;
        this.nationality = nationality;
    }

    @Override
    public String sail(){
        return nationality + " " + shipType + " " + name + " is sailing away";
    }
}
