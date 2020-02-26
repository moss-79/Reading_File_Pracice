package codeDay44;

public class Train extends Vehicle {



    public void makeChoChoSound(){
        System.out.println("Cho Cho");

    }

    public static void main(String[] args) {
        Train t1 = new Train();
        t1.makeChoChoSound();

        t1.make = "Thomas";
        t1.setYear(1999) ;

        t1.start();
        t1.goForward();
    }
}
