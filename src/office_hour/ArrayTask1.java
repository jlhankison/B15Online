package office_hour;

public class ArrayTask1 {

    public static void main(String[] args) {

        String[] groceryItems = new String[]{"apple", "banana","grape","strawberry","blueberry","kiwi"};
        float[] storePrices = new float[]{1.99f, 0.99f, 4.65f, 3.89f, 3.99f, 2.88f};
        int berryCount =0;
        String allItems = "";

        System.out.println("Task 1.0");
        for (String groceryItem : groceryItems) {

            System.out.print(groceryItem + " ");
        }
        System.out.println("\n\nTask 1.1");
        for (int i = groceryItems.length-1; i > 0; i--) {
            System.out.print(groceryItems[i] + " ");
        }
        System.out.println("\n\nTask 1.2");
        for (int j = 0; j < groceryItems.length; j++) {
            if (j % 2 ==1){
                System.out.println(groceryItems[j]);
            }
        }
        System.out.println("\nTask 1.3");
        for (int x = 0; x < groceryItems.length; x++) {
            if (groceryItems[x].equalsIgnoreCase("strawberry")){
                System.out.println("Strawberry index is: " + x);
            }
        }
        System.out.println("\nTask 1.4");
        for (String groceryItem: groceryItems) {
            if (groceryItem.contains("berry")){
                berryCount += 1;
            }
        }
        System.out.println(berryCount);
        System.out.println("\nTask 1.5");
        for (String groceryItem: groceryItems){
            System.out.println(groceryItem.length() + " ");
        }
        System.out.println("\nTask 1.6");
        for (String groceryItem: groceryItems){
            if (groceryItem.length()%2 == 0){
                System.out.println(groceryItem);
            }
        }
        System.out.println("\nTask 1.7");
        for (String groceryItem: groceryItems){
            if (groceryItem.contains("e")){
                System.out.println(groceryItem);
            }
        }
        System.out.println("\nTask 1.8");
        for (String groceryItem: groceryItems){
                System.out.println(groceryItem.substring(groceryItem.length()-3));
        }
        System.out.println("\nTask 1.9");
        for (String groceryItem: groceryItems){
            if (groceryItem.equalsIgnoreCase(groceryItems[groceryItems.length-1])){
                allItems +=  groceryItem;
            }else{
                allItems += groceryItem + ", ";
            }
        }
        System.out.println(allItems);





    }
}
