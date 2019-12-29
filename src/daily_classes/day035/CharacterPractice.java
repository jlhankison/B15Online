package daily_classes.day035;

public class CharacterPractice {

    public static void main(String[] args) {

        String str = "A34B123C4X";
        System.out.println(stringNumberAdder(str));
    }

    public static int stringNumberAdder (String str){
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
           if( Character.isDigit(str.charAt(i))){
               sum += Integer.parseInt(String.valueOf(str.charAt(i)));
           }
        }
        return sum;
    }
}
