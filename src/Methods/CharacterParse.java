package Methods;

public class CharacterParse {

    public static void main(String[] args) {

        System.out.println(CharacterParse.parseChar('0'));
    }

    public static int parseChar (char x){
        //parseChar is a public method that will take the value of any numerical Char and return an int value.

        for (int i = 0; i < 10; i++) {
            //since char is only one character the number of options is very limited. Only 0-9 is accepted.
            //first I created a for loop that will run 0 - 9

            if (x == 48 + i){
                // 48 is the ascii value of '0'
                // essentially, I am checking if the value of char x == the ascii value of 0 + the value of i

                return i;
                //if the above if statement triggers then I know that the value of i = the casted numerical value of char x and I return that value
            }
        }
        return 0;
        //I don't know how to throw an error yet so I had the default return be 0. Not ideal, I know but we haven't learned to do better yet.
    }
}
