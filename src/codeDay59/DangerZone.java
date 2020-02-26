package codeDay59;

public class DangerZone {
    public static void main(String[] args) {

        playWithFire();

    }
    // this is a method that declare , it might throw a checked exception IOException
    // whoever calls it , handle teh consequences themselves
    
    public static void playWithFire(){

        System.out.println("some consequences might happen");
    }
}
