package SlackTasks;

public class OfficeHourTasks {

    public static void main(String[] args) {

        String str = "AABBCCCCC";

        System.out.println(removeDup(str));

        System.out.println(frequency(str, 'C'));

        System.out.println(frequencyOfChars(str));

    }

    public static String removeDup (String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if(!result.contains(Character.toString(str.charAt(i)))){
                result += str.charAt(i);
            }

        }
        return result;
    }

    public static int frequency (String str, char character){

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character){
                count ++;
            }
        }
        return count;
    }

    public static String frequencyOfChars (String str){

        String result ="",
                x = removeDup(str);

        for (int i = 0; i < x.length(); i++) {
            result += Character.toString(x.charAt(i)) + frequency(str, x.charAt(i));

        }
        return result;
    }
}
