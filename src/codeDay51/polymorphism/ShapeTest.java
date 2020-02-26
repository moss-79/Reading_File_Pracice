package codeDay51.polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ShapeTest {



    public static void main(String[] args) {

        Shape s1 = new Triangle();
        Shape s2 = new Rectangle();
        Shape s3 = new Square();
        Shape s4 = new Circle();

        s1.draw();
        s2.draw();
        s3.draw();
        s4.draw();

        System.out.println("----------------------------------");
      Shape [] manyShapes = {s1,s2,s3,s4,s2};

        for (Shape oneShape :
                manyShapes) {
            oneShape.draw();
        }
    }
}
