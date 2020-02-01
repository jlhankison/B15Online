package daily_classes.day051;

public class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int compareTo( Person otherPerson){
        if (this.age>otherPerson.age){
            return 1;
        }else if ( otherPerson.age > this.age){
            return -1;
        }else{
            return  0;
        }
    }

}
