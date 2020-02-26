package codeDay51.polymorphism;

//import codeDay50.Shape;
public class ShapeAreaClass extends codeDay51.polymorphism.Shape {
    public static void main(String[] args) {

        Shape s1 = new Triangle();
        Shape s2 = new Rectangle();
        Shape s3 = new Square();
        Shape s4 = new Circle();

        s1.draw();
        s2.draw();
        s3.draw();
        s4.draw();


    }

    @Override
    public void draw() {
        System.out.println("dada");
    }
}
