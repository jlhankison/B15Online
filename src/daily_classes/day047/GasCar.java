package daily_classes.day047;

public class GasCar extends Car{

    int gasLevel;

    public void setGasLevel(int gasLevel) {
        this.gasLevel = gasLevel;
    }

    @Override
    public void start() {
        System.out.println("Electric car turns on");
    }

    @Override
    public void goForward() {
        if (gasLevel > 0){
            System.out.println(brand + " moves forward");
            gasLevel --;
        }else {
            System.out.println(brand + " out of gas!");
        }
    }

    @Override
    public void goBackward() {
        if (gasLevel > 0){
            System.out.println(brand + " moves backward");
            gasLevel --;
        }else {
            System.out.println(brand + " out of gas!");
        }
    }

    public static void main(String[] args) {

        GasCar gC1 = new GasCar();

        gC1.brand = "Ford";

        gC1.setGasLevel(5);

        for (int i = 0; i <=3; i++) {
            gC1.goForward();
            gC1.goBackward();
        }
    }
}
