package daily_classes.day039;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {


        ArrayList<String> items = new ArrayList<>(Arrays.asList
                ("iPhone 6s,449,18.71",
                "iPhone 6s Plus,549,22.88",
                "iPhone X,1149,56.16",
                "MacbookPro,1499.99,79.49",
                "ThumbDrive,39.99,2.68",
                "Beats HeadPhones,349.99,15.12",
                "Mous,79.99,8.98",
                "Charger,39.99,4.56",
                "iPad,429,18.31",
                "Dyson Vacuum,399,16.25",
                "TV,2199,89.49",
                "Apple Watch,559,21.18"));

        //Task 1
        for (String item : items) {
            System.out.println(item.split(",")[0]);
        }

        System.out.println();
        //Task 2
        for (String item : items) {
            String[] itemDetails = item.split(",");
            if(Double.parseDouble(itemDetails[1]) > 500)
            System.out.println("$" + item.split(",")[1]);
        }

        System.out.println();
        //Task 3
        double total=0;
        for (String item: items) {
            String[] itemDetails = item.split(",");
            total += Double.parseDouble(itemDetails[1]);
        }
        double average = total/items.size();
        System.out.println("Average price $" + average);

        System.out.println();
        //Task 4
        for (String item : items) {
            String[] itemDetails = item.split(",");
            if(Double.parseDouble(itemDetails[2]) < 20)
                System.out.println(item.split(",")[0]);
        }

        System.out.println();
        //Task 5
        for (int i = 0; i < items.size(); i++) {
            String[] itemDetals = items.get(i).split(",");
            if(itemDetals[0].contains("iPhone")){
                System.out.println(itemDetals[0] + " $" + itemDetals[2]);
            }
        }

        System.out.println();
        //Task 6
        double max = 0;
        int index = 0;
        for (int i = 0; i < items.size(); i++){
            String[] itemDetails = items.get(i).split(",");
            double price = Double.parseDouble(itemDetails[1]);
            if(price>max) {
                max = price;
                index = i;
            }
        }
        System.out.println("Most expensive item: " + items.get(index));

        System.out.println();
        //Task 7
        for (int i = 0; i < items.size(); i++) {
            if(items.get(i).contains("Dyson")){
                System.out.println("Before discount: " + items.get(i));
                String[] dyson = items.get(i).split(",");
                double price = Double.parseDouble(dyson[1]);
                price *= .2;
                String replacementItem = items.get(i);
                replacementItem = replacementItem.replace(dyson[1], Double.toString(price));
                replacementItem = replacementItem.replace(dyson[2], Double.toString(price/12));
                System.out.println("After discount: " + replacementItem);
            }
        }

        System.out.println();
        //task 8
        int count = 0;
        for (String item : items) {
            String[] itemDetails = item.split(",");
            if(Double.parseDouble(itemDetails[1])> average){
                count ++;
            }
        }
        System.out.println("count above average price: " + count);

        System.out.println();
        //Task 9;
        ArrayList<String> itemsAboveAverage = new ArrayList<>(items);
        for (int i = 0; i < itemsAboveAverage.size(); i++) {
            String[] itemDetails = itemsAboveAverage.get(i).split(",");
            if(Double.parseDouble(itemDetails[1])> average){
                itemsAboveAverage.remove(i);
                i--;
            }
        }
        System.out.println("Items removed above average price: " + itemsAboveAverage);


    }
}
