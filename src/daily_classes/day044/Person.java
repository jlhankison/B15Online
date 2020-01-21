package daily_classes.day044;

public class Person {

    private String name;

    private int age;

    public static String species;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(){
        this.name = "Unknown name";
        this.age = 0;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", species=" + species +
                '}';
    }
}
