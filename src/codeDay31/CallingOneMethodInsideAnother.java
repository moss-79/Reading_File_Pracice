package codeDay31;

public class CallingOneMethodInsideAnother {
    public static void main(String[] args) {

finallyAwake();
    }public static void finallyAwake(){
        wakeUp();
        drinkCoffee();
    } public static void wakeUp(){
        System.out.println("open your eye");
        System.out.println("close your eye");
        System.out.println("Hear your alarm and get up ? open it again~!");
        System.out.println("2-------------------------------------------");
    } private static void drinkCoffee(){
        System.out.println("put coffee in your coffee machine ");
        System.out.println("press the button make your coffee");
        System.out.println("3-------------------------------------------");
    }
}
