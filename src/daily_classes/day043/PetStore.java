package daily_classes.day043;

import java.util.ArrayList;
import java.util.List;

public class PetStore {

    public static void main(String[] args) {

        List<Pet> store = new ArrayList<>();

        String[] animals = new String[] {"cat", "guinea pig", "dog", "hamster", "cow", "parrot", "horse", "pig"};
        String[] names = new String[] {"Garry", "Eric", "Tommy", "Spot", "Trigger","Penny", "Ann", "Ghost"};

        for (int i = 0; i < 8; i++) {
            store.add(new Pet(animals[i], names[i]));
        }

        //TODO

        for (int i = 0; i < store.size() ; i++) {
            System.out.println(store.get(i));
            System.out.println(store.get(i).getName());
            System.out.println(store.get(i).getType());
            System.out.println(store.get(i).speak());


        }

        for (Pet animal : store){
            if (animal.getType().equalsIgnoreCase("cat")){
                System.out.println(animal);
            }
        }
    }
}
