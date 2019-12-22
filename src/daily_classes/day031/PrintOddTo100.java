package daily_classes.day031;

public class PrintOddTo100 {

    public static void OddTo100(){

        for (int i = 0; i < 100; i++) {
            if( i == 99){

                System.out.println(i);
            }else if (i % 2 ==1){
                System.out.print(i + ", ");
            }
        }
    }
}
