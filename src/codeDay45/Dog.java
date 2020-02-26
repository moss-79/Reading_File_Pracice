package codeDay45;

public class Dog extends Animal {

    @Override // Override is optional
    public void speak() {

        System.out.println("Bark!!!");
    }

    public static void main(String[] args) {

        Dog twix = new Dog();
        twix.speak();
    }

}
