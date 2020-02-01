package daily_classes.day051;

public class Animal {

    public void makeAnimalNoise(){
        System.out.println("General animal noise");

    }
}

class Dog extends Animal{

    @Override
    public void makeAnimalNoise() {
        System.out.println("WOOOF!!");
    }
}

class Horse extends Animal{

    @Override
    public void makeAnimalNoise() {
        System.out.println("NEIGH!!!");
    }
}