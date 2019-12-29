package daily_classes.day035;

public class ParsePractice {

    public static void main(String[] args) {

        String sentence = "I bought 3 tomatoes and the price was 3,14 each";
        priceCalculator(sentence);

    }

    public static void priceCalculator (String str){

        String[] strs = str.split(" ");
        String countStr = strs[2];
        String priceStr = strs[strs.length-2].replace(",", ".");
        int count = Integer.parseInt(countStr);
        float price = Float.parseFloat(priceStr);
        System.out.println("Total Price = " + (count * price));
    }
}
