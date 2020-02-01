package daily_classes.day049;

public class Tesla extends  Vehicle implements Autonomous, Chargeable{

    private int horsePower;
    private String model;

    public Tesla(String brand, int horsePower, String model ) {
        super(brand);
        this.horsePower = horsePower;
        this.model = model;
    }

    @Override
    public void start() {
        System.out.println("The Tesla starts silently");
    }

    @Override
    public void selfDrive() {
        System.out.println("The Tesla self drives");
    }

    @Override
    public void chargeItem() {
        System.out.println("Your Tesla is now Charged!");
    }
}
