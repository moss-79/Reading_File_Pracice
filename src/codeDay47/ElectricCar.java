package codeDay47;

public class ElectricCar extends Car {

    int batteryLevel;

    @Override
    public void start() {
        System.out.println("This is how electric car start ");
    }

    public static void main(String[] args) {

      //  Car c1 = new Car();
         ElectricCar e1 = new ElectricCar();
         e1.start();
         e1.goForward();
         e1.goBackward();
         e1.turn("left" );

        }

    @Override
    public void goForward() {
        System.out.println("Going Forward");
    }

    @Override
    public void goBackward() {
        System.out.println("Going Backward");

    }

    @Override
    public void turn(String direction) {
        System.out.println("Turning "+direction);
    }
}

