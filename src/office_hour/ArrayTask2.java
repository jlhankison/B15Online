package office_hour;

public class ArrayTask2 {

    public static void main(String[] args) {

        String[] groceryItems = new String[]{"apple", "banana","grape","strawberry","blueberry","kiwi"};
        float[] storePrices = new float[]{1.99f, 0.99f, 4.65f, 3.89f, 3.99f, 2.88f};
        int maxPriceIndex = 0,
                secMaxPriceIndex =0,
                minPriceIndex = 0;
        float sum = 0,
                average = 0,
                maxPrice = storePrices[0],
                secMaxPrice = storePrices[0],
                minPrice = storePrices[0];

        System.out.println("Task 2.0");
        for (float storePrice : storePrices) {
            System.out.print(storePrice + " ");
        }
        System.out.println("\n\nTask 2.1");
        for (int i = 0; i < storePrices.length; i++) {
            if (i%2==0){
                System.out.print(storePrices[i] + " ");
            }
        }
        System.out.println("\n\nTask 2.2");
        for (float storePrice : storePrices) {
            if (storePrice < 3) {
                System.out.println(storePrice + " ");
            }
        }
        System.out.println("\nTask 2.3");
        for (float storePrice : storePrices) {
            sum += storePrice;
            average = sum/storePrices.length;
        }
        System.out.println("sum = " + sum);
        System.out.println("average = " + average);
        System.out.println("\nTask 2.4");
        for (float storePrice : storePrices) {
            if (storePrice > average) {
                System.out.println(storePrice);
            }
        }
        System.out.println("\nTask 2.5");
        for (int i = 0; i < storePrices.length; i++) {
            if (storePrices[i] > maxPrice) {
                maxPrice = storePrices[i];
                maxPriceIndex = i;
            }else if (storePrices[i]<maxPrice && storePrices[i]> secMaxPrice){
                secMaxPrice = storePrices[i];
                secMaxPriceIndex = i;
            }
        }
        System.out.println("maxPrice = " + maxPrice);
        System.out.println("maxPriceIndex = " + maxPriceIndex);
        System.out.println("\nTask 2.6");
        for (int i = 0; i < storePrices.length; i++) {
            if (storePrices[i] < maxPrice) {
                minPrice = storePrices[i];
                minPriceIndex = i;
            }
        }
        System.out.println("minPrice = " + minPrice);
        System.out.println("minPriceIndex = " + minPriceIndex);
        System.out.println("\nTask 2.7");
        System.out.println("secMaxPrice = " + secMaxPrice);
        System.out.println("secMaxPriceIndex = " + secMaxPriceIndex);






    }
}
