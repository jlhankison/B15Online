package daily_classes.day006;

public class CompoundOperator2 {

    public static void main(String[] args) {

        // +=, -=, *=, /+, %=  Shorthand operators

        int studentOnline = 263;


//        studentOnline = studentOnline + 5;
            studentOnline += 5;  // <-- this is shorthand operator, it simplifies the above equation so that there is less clutter

        System.out.println("5 people joined the class " + studentOnline);

//        studentOnline = studentOnline -3;
            studentOnline -= 3;
        System.out.println("3 people left the class " + studentOnline);

//        studentOnline = studentOnline * 2;
            studentOnline *= 2;
        System.out.println("student count doubled " +studentOnline);

//        studentOnline = studentOnline / 3 ;
            studentOnline /= 3;
        System.out.println("Student count dropped to 1/3 " + studentOnline);




    }
}
