package daily_classes.day002;

public class VariableIntro {

    public static void main(String[] args) {

        //Int is the data type for integers or whole numbers

        int offerCnt = 3 ;

        int corollaMileage ;
        corollaMileage = 500000000;

        System.out.println("How many offers have been made?");
        System.out.println(offerCnt);

        System.out.println("How many miles are on the Corolla?");
        System.out.println(corollaMileage);


        //Example
        int TVsize = 67 ;
        //Declaration names in Java are extremely case sensitive
        //System.out.println( tvsize ); <--This will not print the variable "TVsize" because it is misspelled
        //end Example

        System.out.println("BEGIN OF DEBUG:");

            int my$FolderCount = 6;

                my$FolderCount = 10;

            System.out.println(my$FolderCount); //computer reads code line by line, so the most recent declaration of
                                                    //value of a variable is the one that will be used, in this case "10"

                my$FolderCount = 100;

            System.out.println(my$FolderCount); //computer reads code line by line, so the most recent declaration of
                                                    //value of a variable is the one that will be used, in this case "100"



        int FavNum = 70 ;
        int ClassCt = 272 ;

        System.out.println("What is my favorite number?");
            System.out.println(FavNum);


        System.out.println("How many students are in the class?");
            System.out.println(ClassCt);




    }
}
