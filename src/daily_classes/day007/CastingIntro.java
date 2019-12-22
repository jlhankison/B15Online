package daily_classes.day007;

public class CastingIntro {

    public static void main(String[] args) {

//        int num = 10;

        double bigNum = 10; //int 10 is implicitly (automatically) converted to double "10.0
                            //and stored inside bigNum behind the scenes
        System.out.println(bigNum);

//        int num = 12.99; // compiler error!!!!
//                  12.99 is a double data type, double has a much bigger range than int so it does not fit
//                  automatically
        int num = (int) 12.99;
        System.out.println(num);


        // create a long variable and store it
        long earthToMoon = 10000; //---> 10000L
        //create an int variable and try to store above long value
        int earthToMoon_int = (int) earthToMoon;

        System.out.println( earthToMoon_int);







    }
}
