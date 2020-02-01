package daily_classes.day049;

public class IceCream extends Object implements Edible{

    @Override
    public void eat (){
        System.out.println("Eat with a spoon");
    }

    @Override
    public void drink (){
        System.out.println("Drink it if it has melted in the cup");
    }

    @Override
    public void digest(){
        System.out.println("Digest the ice cream by licking more");
    }

    public static void main(String[] args) {

        IceCream i1 = new IceCream();

        i1.digest();
    }
}
