package daily_classes.day020;

public class WorkingWithMoreThanOneCharInString {

    public static void main(String[] args) {


        //given a string with even number char count
        // print 2 characters in one line
//                     0123456789012
        String name = "boogienights2" ;

        int a = 2;

        for (int i = 0; i < name.length()-1 ; i+= 2) {

                System.out.println((name.substring(i , i + 2)));
            }

        for (int x = 0; x < name.length()-1; x+=3) {
            System.out.println(name.substring(x, x + 3));

        }
        }
    }

