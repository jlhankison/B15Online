package daily_classes.day029;

public class HeroIdentity {

    public static void main(String[] args) {

        String hero1 = "Superman-Clark J Kent",
                heroTitle,
                hiddenTitle = "";
        int nameLength;

        // first replace everything in the string from index 0 until the "-" with ""
        // then find the string length
        //then replace hero1 with the correct number of stars with a for loop


        heroTitle = hero1.replace(hero1.substring(hero1.indexOf('-') + 1), "");
        hero1 = hero1.replace(hero1.substring(0, hero1.indexOf('-')), "");
        nameLength = hero1.length();

        for (int i = 0; i < nameLength; i++) {
            hiddenTitle += "*";

        }
        hiddenTitle = heroTitle + hiddenTitle;

        System.out.println("hiddenTitle = " + hiddenTitle);
    }
}
