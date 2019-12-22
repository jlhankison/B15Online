package daily_classes.day015;

public class SubStringPractice {

    public static void main(String[] args) {

        //getting part of a string out of another string
        //              012345678901234567890123456
        String movie = "Scott Pilgrim VS. the World";
        
        //I want to get the word "VS." out of the String movie
        
        String vs = movie.substring(14,17);

        System.out.println("vs = " + vs);

        String vsToEnd = movie.substring(movie.indexOf("V"), movie.length());

        System.out.println("vsToEnd = " + vsToEnd);
    }
}
