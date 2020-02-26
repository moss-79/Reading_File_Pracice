package codeDay53;

public abstract class Fruit {


    String taste;
    String color;

    public Fruit(String taste, String color) {

        this.color = color;
        this.taste = taste;
    }

    public abstract void getDigested();


}
