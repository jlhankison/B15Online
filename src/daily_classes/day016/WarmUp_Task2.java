package daily_classes.day016;

public class WarmUp_Task2 {

    public static void main(String[] args) {
        
        int num1 = 25, num2 = 15 , num3 =45;
        int sumOfSpecialNumbers = 0;
        
        if (num1< 20){
            num1 = 0;
        }if (num2< 20){
            num2 = 0;
        }if (num3< 20){
            num3 = 0;
        }
        sumOfSpecialNumbers = num1+ num2 + num3;

        System.out.println("sumOfSpecialNumbers = " + sumOfSpecialNumbers);
        

    }
}
