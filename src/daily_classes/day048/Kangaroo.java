package daily_classes.day048;

public class Kangaroo implements KickBoxer, Bounce {

    String name;
    int jumpDistance;


    public Kangaroo(String name, int jumpDistance) {
        this.name = name;
        this.jumpDistance = jumpDistance;
    }

    @Override
    public void bounce() {
        System.out.println(name + " the kangaroo can jump " + jumpDistance +
                " when the gravity is " + GRAVITY );
    }

    @Override
    public void box() {
        System.out.println("Kangaroo " + name + " can kickbox");
    }

    @Override
    public void carryChildInThePocket() {
        System.out.println("Kangaroo " + name + " carries it's children in it's pocket");
    }

    @Override
    public String toString() {
        return "Kangaroo{" +
                "name='" + name + '\'' +
                ", jumpDistance=" + jumpDistance +
                '}';
    }
}
