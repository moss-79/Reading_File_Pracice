package codeDay31;

public class Greeting {
    public static void main(String[] args) {
sayHello();
sayHelloTo("Batch 15");// --> print hello Btch 15
sayHelloTo("Kids");// -- print hello kids

    }
    // i want to create a method that do below :
    // say hello to the person's name I passed when I call this method

    public static void sayHelloTo(String name){
        System.out.println("Hello "+ name);
    }
    public static void sayHello(){
        System.out.println("Hello B15 ");
    }
}
