package SlackTasks;

public abstract class Animals {

    String name;
    int age;
    double weight;

    public Animals(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public abstract void move();

    public abstract void makeNoise();
}
