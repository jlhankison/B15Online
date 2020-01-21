package daily_classes.day043;

public class Pet {

    private String type;

    private String name;

    public Pet() {
        this.type = "Unknown";
        this.name = "Unnamed";
    }

    public Pet(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String speak() {
        switch (type){
            case "cat":
                return "Meow";
            case "dog":
                return "Woof";
            case "cow":
                return "Moo";
            case "horse":
                return "Neigh";
            default:
                return "No animal sound";
        }
    }

    public String toString() {
        return "Pet{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
