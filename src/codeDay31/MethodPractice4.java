package codeDay31;

public class MethodPractice4 {
    public static void wakeUp(){
        System.out.println("open your eye");
        System.out.println("close your eye");
        System.out.println("Hear your alarm and get up ? open it again~!");
        System.out.println("2-------------------------------------------");
    } private static void drinkCoffee(){
        System.out.println("put coffee in your coffee machine ");
        System.out.println("press the button make your coffee");
        System.out.println("3-------------------------------------------");
    }public static void goToWork(){
        System.out.println("get your keys and drive for 15 miles ");
        System.out.println("reach work by 7 am");
        System.out.println("4-------------------------------------------");
    }public static void groceryShopping() {
        System.out.println("go to Wallmart do shopping from the list(mine)");
        System.out.println("get enjera from Abrams shop");
        System.out.println("5-------------------------------------------");
    }
    public static void studyJava() {
        System.out.println("Think about Java waking up");
        System.out.println("Think about Java drinking coffee");
        System.out.println("Think about Java driving to work");
        System.out.println("Think about Java coming home");
        System.out.println("Eventually practice,practice Java java");
        System.out.println("6-------------------------------------------");
    } public static void goToSleep() {
        System.out.println("brush your teeth after dinner");
        System.out.println("And Sleep");
    }public static void main(String[] args) {
        /*
        *wake up
        * drinkCoffe e
        * PrepareForSchool
        * goToWork
        * groceryShopping
        * COOKING
        * STUDY JAVA
        * GOTO SLEEP
         */
        wakeUp();
        drinkCoffee();
        goToWork();
        groceryShopping();
        studyJava();
        goToSleep();
    }

}
