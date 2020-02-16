package daily_classes.day059;

import java.io.IOException;

public class CheckedAndUnchecked {

    public static void main(String[] args) throws IOException {

        String x = "abc";

//        throw new RuntimeException("This is a runtime exception");

        throw new IOException();

//        try{
//            throw new IOException();
//
//        } catch (Exception e){
//            System.out.println("This attempted IOException has been caught and dealt with");
//        }
    }
}
