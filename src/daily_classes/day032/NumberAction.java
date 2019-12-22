package daily_classes.day032;

public class NumberAction {

    public static void main(String[] args) {
        stringRepeater("Java" , 20);
        System.out.println();
        numberComparitor(3, -21);
        System.out.println();
        skipCountBy3From0To50();
        System.out.println();
        countDownByEvenNumberFrom50To0();
        System.out.println();
        printToX(242);
    }

    public static void stringRepeater(String str , int repeatCount){

        for (int i = 0; i <= repeatCount; i++) {
            System.out.println(str);

        }
    }
    public static void numberComparitor (int num1, int num2){

        if (num1 > num2){
            System.out.println(num1 + " is bigger than " + num2);
        }else if (num2 > num1){
            System.out.println(num2 + " is bigger than " + num1);
        }else {
            System.out.println( num1 + " and " + num2 + " are equal");
        }
    }
    public static void skipCountBy3From0To50 (){

        for (int i = 0; i <= 50; i++) {
            if (i % 3 == 0 && i % 50 < 50-3){
                System.out.print(i + ", ");
            }else if (i % 3 == 0){
                System.out.println(i);
            }
        }
    }
    public static void countDownByEvenNumberFrom50To0(){

        for (int i = 50; i >= 0; i--) {
            if (i == 0){
                System.out.println(i);
            }else if (i%2 == 0){
                System.out.print(i + ", ");
            }
        }
    }
    public static void printToX(int x){
        for (int i = 1; i <= x; i++) {
            if(i == x){
                System.out.println(i);
            }else{
                System.out.print(i + ", ");
            }
        }
    }
}
