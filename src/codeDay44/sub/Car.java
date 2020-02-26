package codeDay44.sub;
import  codeDay44.Vehicle;

public class Car extends Vehicle {

    int mileage;

    public void showInfo(){
        System.out.println("");
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.mileage = 294538;
        c1.make= "Tesla";

        System.out.println("c1.make = " + c1.make);

        System.out.println("c1.mileage = " + c1.mileage);
        
        c1.getYear();
        System.out.println("c1.getYear() = " + c1.getYear());
    }
}
 