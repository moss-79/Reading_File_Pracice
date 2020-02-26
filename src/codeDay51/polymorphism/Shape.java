package codeDay51.polymorphism;

public abstract class Shape {

    public abstract void draw();
}


class Triangle extends Shape{
    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }
}

class Rectangle extends Shape{
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class Square extends Shape{
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}

class Circle extends Shape{
    @Override
    public void draw(){
        System.out.println("Drawing Circle");
    }
}

