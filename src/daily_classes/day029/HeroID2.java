package daily_classes.day029;

public class HeroID2 {
    public static void main(String[] args) {

        String hero1 = "Superman-Clark Kent";

        String[] heroSplit = hero1.split("-");

        hero1 = heroSplit[0] + "-";

        for (int i = 0; i < heroSplit[1].length(); i++) {
            hero1 += "*";
        }

        System.out.println(hero1);
    }

}
