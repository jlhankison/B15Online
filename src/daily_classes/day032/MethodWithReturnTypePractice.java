package daily_classes.day032;

public class MethodWithReturnTypePractice {

    public static double divide(double num1 , double num2){
        if(num2 == 0){
            return 0;
        }else {
            return num1/num2;
        }
    }

    public static void main(String[] args) {

        System.out.println( divide(10, 3));

        System.out.println(divide(10,0));
    }
}
