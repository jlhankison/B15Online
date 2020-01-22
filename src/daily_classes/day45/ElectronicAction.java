package daily_classes.day45;

public class ElectronicAction {

    public static void main(String[] args) {
        Phone pixel = new Phone();

        pixel.size = 12;
        pixel.price = 600;
        pixel.brand = "Google";

        System.out.println(pixel.showUseElectricity());
        System.out.println(pixel.toString());
    }
}
