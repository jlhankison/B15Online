package daily_classes.day007;

public class CastingChar {

    public static void main(String[] args) {

        char grade = 'B';

        System.out.println( grade);

        //'B' is represented by 66 in ascii table
        //here type char is automatically widened to int
        //and has been stored as a number

        int letterInNumber = 'B';
        System.out.println(letterInNumber);

        int letterInNumber2 = 'b';
        System.out.println(letterInNumber2);

        //-------------------------------
        //saving the number as char
        //so we can get the character representation
        //of the number in ascii table

        char myFirstChar = (char) 100;
        System.out.println(myFirstChar);

        //find out the number of each character in your first name

        char J, o, r, d, a, n;
        J = (char) 74;
        o = (char) 111;
        r = (char) 114;
        d = (char) 100;
        a = (char) 97;
        n = (char) 110;

        System.out.println( J + o + r+ d + a + n); // <-- Apparently you need to open a string first before you try to concatenate multiple
                                                        //converted chars, else java will attempt to ADD THE ASCII NUMBER VALUES TOGETHER
                                                        //example, without "" this will output 606 (total of all ascii numbers)
                                                        //example, with "" will output "Jordan"

        char letterA = 'a';
        //adding a character to an int number will result in int
        //(int) letterA + 1
        System.out.println(letterA + 1);


    }
}
