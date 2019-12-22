package daily_classes.day003;

public class PrimitivesPractice {

    public static void SeriesOfPrimitives() {

        byte letterCount = 26;
        short sheepCount = 300;
        int catCount = 20;
        long milesToSun = 92955807l;

        //--------floating point --------
        // you must add f or F at the end of a float to indicate this is a float data type otherwise the compiler will
            //think it's a double

        float priceOfBanana = 1.99f;
        float priceOfPotato = 2.49F;

        //------larger floating point numbers--------

        double priceOfIpad    = 355.99d  ;
        double priceOfIpadPro = 1024.99D ;
        double priceOfMac     = 2299.99  ; //<-- compiler automatically assumes that floating numbers are "double
                                                //However it is a good programing habit to always designate

        //if you have a whole number by itself, compiler automatically assumes its an int
        //if you have a fractional number by itself, compiler automatically assumes its a double

        System.out.println( "How many letters are in the alphabet?\t" + letterCount);

        System.out.println( "How many sheep?\t" + sheepCount);

        System.out.println( "Cat count?\t" + catCount);

        System.out.println ( "How many miles to the sun?\t" + milesToSun);

        System.out.println ( "what is the price of bananas?\t" + priceOfBanana);

        System.out.println( "Cost of potatoes?\t" + priceOfPotato);

        System.out.println( "price of Ipad?\t" + priceOfIpad);

        System.out.println( "Price of Mac?\t" + priceOfMac);

        System.out.println ( "What is the price of an Ipad Pro?\t" + priceOfIpadPro);





    }
}
