package daily_classes.day048;

public class Barque implements TallShip{

    String name;
    private String shipType = "Barque";
    String nationality;

    public Barque(String name, String nationality) {
        this.name = name;
        this.nationality = nationality;
    }

    @Override
    public String sail() {
        return nationality + " " + shipType + " " + name + " is sailing away";
    }
}
