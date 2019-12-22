package daily_classes.day031;

public class Calculator {

    public static void calculator (int num1 , char operator, int num2){

        if (operator == '/'){
            System.out.println("Division result " + (num1 / num2));
        }else if (operator == 'x' || operator == '*'){
            System.out.println("Multiplication result " + (num1 * num2));
        }else if (operator == '+'){
            System.out.println("Addition result " + (num1 + num2));
        }else if (operator == '-'){
            System.out.println("Subtraction result " + (num1 - num2));
        }

    }
}
