package codeDay48;

// we built relationship between class and interface
// using implements keyword
// (compared to extends keyword for class to class )
// it will build a IS-A relationship
// we can say plane IS-A Flyable
// since we are inheriting an abstract method
// we need to provide body by overriding it
public class Plane implements Flyable{

    String name;
    int capacity ;
    int speed;
//    public static final boolean HAVE_WING = true ;


    @Override
    public void fly() {
        System.out.println("Plane is flying ");
    }

    public static void main(String[] args) {
        Plane p1 = new Plane();
        p1.fly();
        // anything static , we can access in static way
        // including the static field of interface
        System.out.println(Flyable.HAVE_WING);
        // IF WE have static field in this class
        // can we access them in static method
    }
}
