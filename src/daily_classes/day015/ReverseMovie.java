package daily_classes.day015;

public class ReverseMovie {

    public static void main(String[] args) {
                    //  0123456789012345678901234567
        String movie = "Scott Pilgrim VS. the World";

        //I will convert all the words into individual strings then i will concatinate them backwards

        System.out.println(movie.substring(22) + " Java" + movie.substring(17,22)  + movie.substring(14,18)
                +  movie.substring(6,14) + movie.substring(0,5));


}
}
