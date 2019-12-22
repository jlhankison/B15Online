package office_hour;

public class ArrayTask3 {

    public static void main(String[] args) {

        String[] groceryItems = new String[]{"apple", "banana","grape","strawberry","blueberry","kiwi"};
        float[] storePrices = new float[]{1.99f, 0.99f, 4.65f, 3.89f, 3.99f, 2.88f};
        int maxPriceIndex = 0,
                minPriceIndex = 0;
        float average = 0,
                sum = 0,
                maxPrice = storePrices[0],
                minPrice = storePrices[0];


        System.out.println("Task 3.0");
        System.out.print(groceryItems[0] + " price is " + storePrices[0]);
        System.out.println("\n\nTask 3.1");
        System.out.print(groceryItems[groceryItems.length-1] + " price is " + storePrices[storePrices.length-1]);
        System.out.println("\n\nTask 3.2");
        for (int i = 0; i < groceryItems.length; i++) {
            System.out.println(groceryItems[i] + " price is " + storePrices[i]);
        }
        System.out.println("\nTask 3.3");
        for (int i = 0; i < groceryItems.length; i++) {
            if (storePrices[i] > 3.11) {
                System.out.println(groceryItems[i]);
            }
        }
        System.out.println("\nTask 3.4");
        for (int i = 0; i < groceryItems.length; i++) {
            if (i == 0){
                for (int j = 0; j < groceryItems.length; j++) {
                    sum += storePrices[j];
                    average = sum/storePrices.length;
                }
            }
            if (storePrices[i]>average){
                System.out.println(groceryItems[i]);
            }
        }
        System.out.println("\nTask 3.5");
        for (int i = 0; i < groceryItems.length; i++) {
            if (groceryItems[i].contains("b")){
                System.out.println(storePrices[i]);
            }
        }
        System.out.println("\nTask 3.6");
        for (int i = 0; i < groceryItems.length; i++) {
            if (storePrices[i]>maxPrice){
                maxPrice = storePrices[i];
                maxPriceIndex = i;
            }
        }
        System.out.println(groceryItems[maxPriceIndex]);
        System.out.println("\nTask 3.7");
        for (int i = 0; i < groceryItems.length; i++) {
            if (storePrices[i]<minPrice){
                minPrice = storePrices[i];
                minPriceIndex = i;
            }
        }
        System.out.println(groceryItems[minPriceIndex]);




    }
}
