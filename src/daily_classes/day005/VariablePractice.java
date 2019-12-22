package daily_classes.day005;

public class VariablePractice {

    public static void main(String [] args) {

        // 8 primitive
        /*
        This is a block comment, everything in between will be commented out

        whole numbers           :byte, short, int, long
        fractional numbers      :float, double
        logical                 :boolean
        character               :char (single character in single 'quote'

        usually, for whole numbers, default to: int
        usually, for fractional numbers, default to: double

        String is not a primitive data type, it is a sequence of characters

         */
//        int birthYear;
//        int currentYear = 2019;
//        int currentAge;
//
//        System.out.print("Please enter your birth year: ");
//
//        Scanner userInput = new Scanner(System.in);
//
//        birthYear = userInput.nextInt();
//
//        currentAge = currentYear - birthYear;
//
//        System.out.println("You are currently " + currentAge + " years old.");

        // Task 2: you are speeding today
        // speed limit is varX, and your current speed is varY
        // generate this output: you are driving 10 mph more than the speedlimit

        int mySpeed = 65;
        int speedLimit = 55;
        int difference = mySpeed - speedLimit;

        System.out.println("You are speeding. You were driving " + mySpeed + "mph. The speed limit here is " + speedLimit +
                ".  You were going " + difference + " mph over the limit.");









    }
}
