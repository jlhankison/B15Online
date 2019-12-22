package daily_classes.day029;

public class StringPractice {

    public static void main(String[] args) {

        String hero = "Superman-Clark D Kent";
        char firstInit,
                secondInit;

        hero = hero.replace("Superman-", "");

        String[] heroName = hero.split(" ");

        firstInit = heroName[0].charAt(0);
        secondInit = heroName[heroName.length-1].charAt(0);

        System.out.println(firstInit + " " + secondInit);


    }
}
