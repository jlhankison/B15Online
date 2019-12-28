package daily_classes.day034;

public class OverloadTask {

    public static void main(String[] args) {

        add(12);
        add(5, 12);
        add(145534366L, 12885939439L);
        add(12,9, 19);
    }

    public static void add (int x){
        System.out.println(x + 100 );

    } public static void add (int x, int y){
        System.out.println(x + y );

    } public static void add (int x, int y, int z){
        System.out.println(x + y + z );

    } public static void add (long x, long y){
        System.out.println(x + y );

    }
}
