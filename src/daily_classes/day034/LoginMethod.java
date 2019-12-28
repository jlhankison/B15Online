package daily_classes.day034;

public class LoginMethod {

    public static void login1 ( String user, String password){

        if ( !user.equals("user") && !password.equals("abc123")  ){
            System.out.println("Invalid user name and password");
        }else if (!password.equals("abc123")  ){
            System.out.println("Incorrect password");
        }else if ( !user.equals("user")){
            System.out.println("Incorrect user name");
        }else{
            System.out.println("Login Successful");
        }
    }

    public static boolean login2 (String user, String password){
        return user.equals("user") && password.equals("abc123");
    }
}