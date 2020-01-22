package daily_classes.day044;

public class CyberHouse {

    int houseNum;
    String design;


    private static String neighborhoodName;

    public CyberHouse(int houseNum, String design) {
        this.houseNum = houseNum;
        this.design = design;
    }

    public String toString() {
        return "CyberHouse{" +
                "houseNum=" + houseNum +
                ", design='" + design + '\'' +
                '}';
    }

    public static void showNeighborhood(){
        System.out.println("neighborhoodName = " + neighborhoodName);
    }
}
