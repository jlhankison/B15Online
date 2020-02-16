package daily_classes.day060;

public class MyCheckedException extends Exception {


}

class Main2{

    public static void main(String[] args) throws MyCheckedException{

        try {
            throw new MyCheckedException();
        } catch (MyCheckedException e) {
            e.printStackTrace();
        }
    }
}
