package daily_classes.day043;

/**
 * A public class that creates an object Coffee with characteristics about that coffee.
 *
 */
public class Coffee {

    private String type;
    private int caffeineLevel;
    private double price;

    public Coffee(String type, int caffeineLevel, double price) {
        this.type = type;
        this.caffeineLevel = caffeineLevel;
        if(price> 0){
            this.price = price;
        }else {
            this.price = 1;
        }
    }
    public Coffee(){
        this.type = "Unknown type";
        this.caffeineLevel = 0;
        this.price = 0.0;
    }
    public double getPrice () { return this.price; }

    public String getType () { return this.type; }

    public int getCaffeineLevel () { return this.caffeineLevel; }

    public String toString() {
        return "Coffee{" +
                "type='" + type + '\'' +
                ", caffeineLevel=" + caffeineLevel +
                ", price=" + price +
                '}';
    }

}
