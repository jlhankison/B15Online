package daily_classes.day013;

public class WarmUp_Amazon {

    public static void main(String[] args) {

        /*
        Amazon has 2 types of user, one is Prime Member and another is regular
        member
        Prime member gets free shipping in all purchases no matter the amount
        regular member user get free shipping only if th
         */

        String memberType = "Non member";
        Double itemPrice = 30d;
        int shippingFee = 5;


        if (memberType.equalsIgnoreCase("prime member")){
            System.out.println("Shipping is free for you!");
            System.out.println("Your total cost: $" + itemPrice);
        }else if (itemPrice >= 30){
            System.out.println("Non-prime members get FREE shipping on orders over $30!");
            System.out.println("Your total cost: $" + itemPrice);
        }else {
            System.out.println("Shipping for non-prime members costs " + shippingFee + " on purchases under $30");
            System.out.println("Your total cost: $" + (itemPrice + shippingFee));
        }

    }
}
