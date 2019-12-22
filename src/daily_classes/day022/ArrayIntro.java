package daily_classes.day022;

public class ArrayIntro {

    public static void main(String[] args) {

        //syntax for creating an array and assigning value
        // dataType [] variableName = new dataType[ count of item ];

        int [] scores = new int[4] ;

        scores[0] = 95;
        scores[1] = 70;
        scores[2] = 88;
        scores[3] = 100;


        int[] numbers = new int[3];

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        byte[] data = new byte[4];

        data[0] = 6;
        data[1] = 9;
        data[2] = 1;
        data[3] = 19;

        System.out.println(data[0]);
        System.out.println(data[1]);
        System.out.println(data[2]);
        System.out.println(data[3]);

        System.out.println(data[3] + " + " + data[0] + " = ");
        data[3] += data[0];
        System.out.println(data[3]);




    }
}
