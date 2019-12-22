package daily_classes.day032;

public class ReturnMethodsIntro {

    public static String myName (){
        return "Jordan";
    }


    public static int doubledValue(int x){
        return x * 2;
    }
    public static void main(String[] args) {
        System.out.println(myName());
        int num = 954;
        System.out.println(doubledValue(num));
    }
}


