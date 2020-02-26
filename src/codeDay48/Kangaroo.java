package codeDay48;

public class Kangaroo implements Bouncible , BoxerWithBellyPouch{

     String name;
    int jumpDistance;

    public Kangaroo(String name, int jumpDistance) {
        this.name = name;
        this.jumpDistance = jumpDistance;
    }

    public void eat(){
        System.out.println("Kangaroo with name "+ name + " is eating ");
    }

    @Override
    public void bounce() {

        System.out.println("This " + name + " kangaroo is bouncing if gravity is " + gravity+ " jumping for " + jumpDistance+ "meters");
    }

    @Override
    public String toString() {
        return "Kangaroo{" +
                "name='" + name + '\'' +
                ", jumpDistance=" + jumpDistance +
                '}';
    }

    @Override
    public void kickBox() {
        System.out.println("Kangaroo with name "+ name+ " is boxing");
    }

    @Override
    public void carryChildInThePocket() {
        System.out.println("Kangaroo with name "+ name+ " carry child in the pocket");
    }
}
