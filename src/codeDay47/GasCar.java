package codeDay47;

public class GasCar extends Car {
    int gasLevel;


 //  GasCar c2 = new GasCar();
//       c2.start();
//       c2.goForward();
//       c2.goBackward();
//       c2.turn("left");

    @Override
    public void start() {
        System.out.println("Gas car starting ");

    }

    @Override
    public void goForward() {
        System.out.println("Gas car gong forward ");

    }

    @Override
    public void goBackward() {
        System.out.println("Gas car gong backward ");

    }

    @Override
    public void turn(String direction) {
        System.out.println("Gas car turning "+ direction);

    }
}
