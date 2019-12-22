package daily_classes.day025;

import java.util.Arrays;

public class NameArraySort {
    public static void main(String[] args) {

        char[] nameArray = "Jordan Hankison".toCharArray();
        char placeholder;

        for (int i = 0; i < nameArray.length; i++) {
            for (int j = i; j < nameArray.length; j++) {

                if (nameArray[i]> nameArray[j]){
                    placeholder = nameArray[i];
                    nameArray[i] = nameArray[j];
                    nameArray[j] = placeholder;
                    System.out.println(Arrays.toString(nameArray));
                }
            }
        }



    }
}
