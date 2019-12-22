package office_hour;

public class ArrayTask4 {

    public static void main(String[] args) {

        String[] groceryItems = new String[]{"apple", "banana","grape","strawberry","blueberry","kiwi"};
        float[] storePrices = new float[]{1.99f, 0.99f, 4.65f, 3.89f, 3.99f, 2.88f};
        String placeHolderS;
        int maxPriceIndex = 0;
        float placeHolderF;

        System.out.println("Task 4.1");
        placeHolderS = groceryItems[0];
        groceryItems[0]= groceryItems[groceryItems.length-1];
        groceryItems[groceryItems.length-1] = placeHolderS;
        placeHolderF = storePrices[0];
        storePrices[0] = storePrices[storePrices.length-1];
        storePrices[storePrices.length-1] = placeHolderF;
        for (int i = 0; i < storePrices.length; i++) {
            System.out.println(groceryItems[i] + " price is " + storePrices[i]);
        }
        System.out.println("\nTask 4.2");
        for (int i = 0; i < groceryItems.length; i++){
            groceryItems[i] += groceryItems[i].length();
            System.out.println(groceryItems[i]);
        }
        System.out.println("\nTask 4.3");
        for (int i = 0; i < storePrices.length; i++){
            storePrices[i] ++;
            System.out.println(storePrices[i]);
        }
        System.out.println("\nTask 4.4");
        for (int i = 0; i < storePrices.length; i++){
            storePrices[i] *= 2;
            System.out.println(storePrices[i]);
        }
        System.out.println("\nTask 4.5");
        for (int i = 0; i < storePrices.length; i++) {
            if (storePrices[i]< 4){
                storePrices[i] *= 3;
            }
            System.out.println(storePrices[i]);
        }
        float maxPrice = storePrices[0];
        System.out.println("\nTask 4.6");
        for (int i = 0; i < storePrices.length ; i++){
            if(storePrices[i]>maxPrice){
                maxPrice = storePrices[i];
                maxPriceIndex = i;
            }
        }
        System.out.println("maxPrice = " + maxPrice);
        System.out.println("\nTask 4.7");
        System.out.println("Max price item = " + groceryItems[maxPriceIndex]);



    }
}
